package com.arpu.plus;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.classmate.AnnotationConfiguration;

public class Main {

	  public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
	      Student_Info student_Info = (Student_Info)context.getBean("student");
	      student_Info.setName("HELAHOOB");
	      student_Info.setRollNo(2020);
	      student_Info.printData();
	      //Hibernate 
	      Logger logger = Logger.getLogger(Main.class);
	      logger.info("Trying to create a test connection with the database.");
	      Configuration configuration = new Configuration();
	      configuration.addClass(Student_Info.class);
	      configuration.addResource("hibernate.cfg.xml");
	      //configuration.configure("file:src/main/resources/hibernate.cfg.xml");
	      StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	      SessionFactory sessionFactory =configuration.buildSessionFactory(ssrb.build());
	      Session session = sessionFactory.openSession();
	      session.beginTransaction();
	      session.save(student_Info);
	      session.getTransaction().commit();
	      session.close();
	      sessionFactory.close();
	      
	      System.out.println("SSSSSSSSSSS");
	  }
}
