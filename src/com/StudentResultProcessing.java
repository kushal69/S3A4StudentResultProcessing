package com;

import java.util.Scanner;

public class StudentResultProcessing extends Student{		// Extended Student Class
	
	// Constructor with Parameters
	StudentResultProcessing(String name, String rollNumber, String phoneNumber, String studentClass) {
		super(name, rollNumber, phoneNumber, studentClass);					// Setting Student Class attribute values by using super method
	}
	
	//	Method to process Student Marks
	public void studentResultProcessing(StudentResultProcessing processingObject, String rollNumber, int sMarksP, int sMarksC, int sMarksM){
		
		boolean pass = false;
		if(sMarksP < 0 || sMarksC < 0 || sMarksM < 0){		//	Condition to check valid marks
			System.out.println("************************ENTER VALID MARKS*************************");
		} else {
			pass = processingObject.result(rollNumber, sMarksP, sMarksC, sMarksM);			// Calling Extended class result method to find out PASS or FAIL
			
			//	Printing Student Details
			System.out.println("----------------------------------------------------" );
			System.out.println("Name : " + processingObject.getName().toUpperCase());
			System.out.println("Roll Number : " + processingObject.getRollNumber());
			System.out.println("Class : " + processingObject.getStudentClass());
			System.out.println("Phone Number : " + processingObject.getPhoneNumber());
			
			if(pass){
				System.out.println("Result : " + "PASS");
			} else {
				System.out.println("Result : " + "FAIL");
			}
			System.out.println("----------------------------------------------------" );
		}
		
	}
	
	//	Main Function
	public static void main(String[] args) {
		
		Scanner in = null; 
		int cont = 1;
		
		for(;;){
			if(cont == 1){
				in = new Scanner(System.in);	//	Scanner object to get user input.
				String sName;
				String sROll;
				String sPhNo;
				String sClass;
				int sMarksP;
				int sMarksC;
				int sMarksM;
				
				System.out.print("Enter Student Name : ");
				sName = in.nextLine();
				System.out.print("Enter Student Roll number : ");
				sROll = in.nextLine();
				System.out.print("Enter Student Phone number : ");
				sPhNo = in.nextLine();
				System.out.print("Enter Student Class : ");
				sClass = in.nextLine();
				
				System.out.print("Enter PHYSICS marks : ");
				sMarksP = in.nextInt();
				System.out.print("Enter CHEMISTRY marks : ");
				sMarksC = in.nextInt();
				System.out.print("Enter MATHEMATICS marks : ");
				sMarksM = in.nextInt();
				
				StudentResultProcessing resultProcessing = new StudentResultProcessing(sName, sROll, sPhNo, sClass);	//	Calling Constructor
				resultProcessing.studentResultProcessing(resultProcessing, sROll, sMarksP, sMarksC, sMarksM);
				
				System.out.print("Want to enter another Student Enter 1 for YES and 0 for NO : ");
				cont = in.nextInt();
			} else {
				in.close();
				System.out.println("***************************************************************");
				System.exit(1);
			}
		}
	}
}
