package com.yc.thread.d0730;

import com.yc.thread.d0729.Cookie;
import com.yc.thread.d0729.HttpServlet;
import com.yc.thread.d0729.HttpServletRequest;
import com.yc.thread.d0729.HttpServletResponse;

public class CookieServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Cookie cookie=new Cookie("name","wusong");
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
		
		response.getWriter().append("cookie");
	}
	//李四提交的注释
//嘤嘤嘤
}
