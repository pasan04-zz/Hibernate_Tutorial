package com.oop.demo.run;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.oop.demo.entity.Student;

public class CreateStudentDemo {

	
	
	public static void main(String[] args) {
		
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
					
				
				//create session
				Session session = factory.getCurrentSession();
				
				try {
					//use the session object to save java object
					System.out.println("Creating new student object ..");
					Student tempStudent = new Student("Paul","Wall","pasankamburugamuwa1@gmail.com");
					
					//create student object	
					
					
					//start transaction
					session.beginTransaction();
					
					//save
					System.out.println("Saving student object ..");
					session.save(tempStudent);
					
					session.getTransaction().commit();
					
					System.out.println("Done !");
					
				}
				finally {
					factory.close();
					
				}
	}
	
								
}

