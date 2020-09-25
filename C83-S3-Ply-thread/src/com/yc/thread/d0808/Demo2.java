package com.yc.thread.d0808;

import java.lang.reflect.Method;


@Test("测试类")
public class Demo2 {
	
	@Test("测试方法")
	public void test() {
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Demo2 d=new Demo2();
		
		Class<?> cls=Demo2.class;
		
		cls=d.getClass();
		
		cls=Class.forName("com.yc.thread.d0808.Demo2");
		
		cls.getFields();
		cls.getMethods();
		cls.getConstructor();
		
		cls.getAnnotations();
		
		Test test1=cls.getAnnotation(Test.class);
		
		System.out.println(test1.value());
		
		Method m=cls.getMethod("test");
		
		Test test2=m.getAnnotation(Test.class);
		System.out.println(test2.value());
	}
	

}
