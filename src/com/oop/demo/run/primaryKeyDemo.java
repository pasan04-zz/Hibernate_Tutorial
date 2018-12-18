package com.oop.demo.run;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.oop.demo.entity.Student;

public class primaryKeyDemo {

	
	
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
					Student tempStudent1 = new Student("Pasan","Wall1","pasankamburugamuwa1@gmail.com");
					Student tempStudent2 = new Student("shameen","Wall2","pasankam123@gmail.com");
					Student tempStudent3 = new Student("kasun","Wall3","pasankambur1@gmail.com");
					Student tempStudent4 = new Student("supun","Wall4","pasankamburugamu1@gmail.com");
					
					//create student object	
					
					
					//start transaction
					session.beginTransaction();
					
					//save
					System.out.println("Saving student object ..");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					session.save(tempStudent4);
					session.getTransaction().commit();
					
					System.out.println("Done !");
					
				}
				finally {
					factory.close();
					
				}
	}
	
								
}

