package com.arpu.plus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	  public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
	      Student_Info student_Info = (Student_Info)context.getBean("student");
	      student_Info.setName("HELAHOOB");
	      student_Info.setRollNo(2020);
	      student_Info.printData();
	      
	      System.out.println("SSSSSSSSSSS");
	  }
}
