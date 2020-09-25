package com.yc.thread.d0808;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD,
		ElementType.LOCAL_VARIABLE,
		ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
	public @interface Test {
	String value() default "";
	}

@Target(value= {ElementType.METHOD})
@interface Select{
	String [] value();
	
	int age() default 100;
}


