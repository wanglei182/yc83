package com.yc.thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DemoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1",8888);
		
		InetAddress myAddress=socket.getInetAddress();
		SocketAddress otherAddress =socket.getRemoteSocketAddress();
		System.out.println("我的地址"+myAddress);
		System.out.println("服务器的地址"+otherAddress);
		InputStream in =socket.getInputStream();
		OutputStream out =socket.getOutputStream();
		Scanner sc=new Scanner(System.in);
		
		new Thread() {
			public void run() {
				try {
					byte[] buffer=new byte[1024];
					int count;
					while(true) {
						count =in.read(buffer);
						System.out.println("她说:"+new String(buffer,0,count));
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
					while(true) {
						System.out.println("我说:");
						try {
							out.write(sc.nextLine().getBytes());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		}.start();
	}
}
