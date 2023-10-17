package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Student s= (Student)con.getBean("nanu");
		System.out.println(s.getSubjects());
		

	}

}
