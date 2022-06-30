package com.Project.ProjectJIo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;


public class Service {

	public void getData() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name:");
		String name=scanner.nextLine();
		System.out.println("Enter id:");
		int id=scanner.nextInt();
		System.out.println("Enter designation:");
		String designation=scanner.next();
		System.out.println("Enter the age");
		int age= scanner.nextInt();
		
		
		Doctor doc = new Doctor();
		doc.setAge(age);
		doc.setDesignation(designation);
		doc.setId(id);
		doc.setName(name);
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("new");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(doc);
			transaction.commit();
		
			System.out.println("Data Get Added Succesfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			factory.close();
			manager.close();
	}
	
		
	
}
	public void viewData() {
		Scanner scanner=  new Scanner(System.in);
		System.out.println("Enter id  of user you want to find");
		int id=scanner.nextInt();


		EntityManagerFactory factory=Persistence.createEntityManagerFactory("new");
		
		EntityManager manager=factory.createEntityManager();
        
//		Employee e=manager.find(Employee.class, id);
		Doctor doc = manager.find(Doctor.class, id);
        
		try {
			System.out.println(doc.getId());
			
			System.out.println(doc.getDesignation());
	        
			System.out.println(doc.getName());
			
			System.out.println(doc.getAge());
		} catch (Exception e2) {
			// TODO: handle exception
									System.out.println("Something went wrong");
		}
		finally {
				manager.close();
				factory.close();
					
		}
		
}
	
	
	




}
