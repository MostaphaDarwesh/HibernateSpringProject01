package com.arpu.plus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	

  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      Student_Info student_Info = (Student_Info)context.getBean("student");
      student_Info.printData();
  }
}