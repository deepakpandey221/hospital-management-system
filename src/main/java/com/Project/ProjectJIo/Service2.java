package com.Project.ProjectJIo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Service2 {
	public void nurseData() {
		Nurse nurse = new Nurse();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of nurse");
	    String name = scanner.next();
	    System.out.println("Enter the id ");
	    int id =scanner.nextInt();
	    System.out.println("Enter the name of patient assigned");
	    String patient_assigned = scanner.next();
	    
	    EntityManagerFactory  factory= Persistence.createEntityManagerFactory("new");
	    EntityManager manager =factory.createEntityManager();
	    EntityTransaction transaction = manager.getTransaction();
	    
	    try {
	    	nurse.setId(id);
	    	nurse.setName(name);
	    	nurse.setPatient_assigned(patient_assigned);
	    	System.out.println("data added succesfully");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong");
		}
	    
	    
	}
	
	public void viewData() {
		Scanner scanner=  new Scanner(System.in);
		System.out.println("Enter id  of user you want to find");
		int id=scanner.nextInt();


		EntityManagerFactory factory=Persistence.createEntityManagerFactory("new");
		
		EntityManager manager=factory.createEntityManager();
        
//		Employee e=manager.find(Employee.class, id);
		Nurse nurse= manager.find(Nurse.class, id);
        
		try {
			System.out.println(nurse.getId());
			
		
	        
			System.out.println(nurse.getName());
			
			System.out.println(nurse.getPatient_assigned());
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
