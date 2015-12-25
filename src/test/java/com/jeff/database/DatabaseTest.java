package com.jeff.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseTest {

	public static ApplicationContext act ;
	
	static{
		act = new ClassPathXmlApplicationContext(new String[]{"classpath*:applicationContext.xml"});
	}
	
	public static void main(String[] args) {
		Object obj  = act.getBean("dataSource");
		System.out.println(obj);
	}
}
