package com.Project.ProjectJIo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Service3 {
	public void getData() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name:");
		String name=scanner.next();
		System.out.println("Enter id:");
		int id_patient=scanner.nextInt();
		
		System.out.println("Enter address:");
		
		String address=scanner.next();
		
		System.out.println("enter the medicine recc.");
		String medicine_recc=scanner.next();
		 
		
	Patient patient = new Patient();

	patient.setAddress(address);
	patient.setId(id_patient);
	patient.setMedicine_recc(medicine_recc);
	patient.setName(name);
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("new");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction= manager.getTransaction();
	try {
		transaction.begin();
		manager.persist(patient);
		transaction.commit();
		System.out.println("Data Get Added Succesfully");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("Something went wrong");
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
		        
//				Employee e=manager.find(Employee.class, id);
				Patient patient= manager.find(Patient.class, id);
		        
				try {
					System.out.println(patient.getId());
					
					System.out.println(patient.getAddress());
			        
					System.out.println(patient.getName());
					
					System.out.println(patient.getMedicine_recc());
				} catch (Exception e2) {
					// TODO: handle exception
											System.out.println("Something went wrong");
				}
				finally {
						manager.close();
						factory.close();
							
				}
				
	}
	public void updateData() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the id");
		int id= scanner.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("new");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
//		Employee e1=manager.find(Employee.class, id);
		Patient patient = manager.find(Patient.class, id);
		
		try {
			System.out.println("Id is "+patient.getId());
			System.out.println("Name is "+patient.getName());
			System.out.println("Designation is :"+ patient.getAddress());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("something went wrong");
		}
		finally {
			factory.close();
			manager.close();
		}
	}
	public void removeData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("new");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Patient patient= manager.find(Patient.class,id);
		try {
			transaction.begin();
			manager.remove(patient);
			transaction.commit();
			System.out.println("Data Get removed Succesfully");
			
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("something went wrong");
		}
		finally {
			factory.close();
			manager.close();
		}
	}
}
