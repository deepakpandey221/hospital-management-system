package com.Project.ProjectJIo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Service service = new Service();
      Service2 service2= new Service2();
      Service3 service3 = new Service3();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input the data to added");
      System.out.println("Enter 1 to add the data");
      System.out.println("Enter 2 to show the detail of a particular doctor");
      System.out.println("Enter 3 to add the data of the nurse");
      System.out.println("Enter 4 to get  detail of nurse");
      System.out.println("Enter 5 to add patient details");
      System.out.println("Enter 6 to get details of the patient");
      System.out.println("Enter 7  to update the data of the patient");
      System.out.println("Enter 8 to  update the details");
      System.out.println("Enter 9 to remove the data");
      int input= scanner.nextInt();
      if(input==1) {
    	 
    	  
    	 service.getData();
      }
      if (input==2) {
		service.viewData();
	}
      else if(input==3) {
    	  service2.nurseData();
      }
      else if (input==4) {
    	  service2.viewData();
		
	}
      else if (input==5) {
    	  service3.getData();
      }
      else if (input==6) {
		service3.viewData();
	}
      else if (input==8) {
		service3.updateData();
	}else if (input==9) {
	 service3.removeData();	
	}
    }
}
