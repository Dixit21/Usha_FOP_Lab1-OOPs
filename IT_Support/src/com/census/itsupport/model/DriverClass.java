package com.census.itsupport.model;
import java.util.Scanner;

import com.census.itsupport.services.*;

public class DriverClass {

	public static void main(String[] args) {
		
			Employee employee =new Employee("Usha","Dixit");
			CredentialService cs= new CredentialService();
			String generatedEmail;
			char[] generatePassword;
			System.out.println("Please Enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			Scanner sc=new Scanner(System.in);
			int option =sc.nextInt();
			if (option==1) {
				 generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), 
						 "tech" );
				 generatePassword=cs.generatePassword() ;
				 cs.showCredentials(employee, generatedEmail, generatePassword);
			}
			else if(option==2) {
				generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), 
						 "adm" );
				 generatePassword=cs.generatePassword() ;
				 cs.showCredentials(employee, generatedEmail, generatePassword);
				
			}
			else if(option==3) {
				generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), 
						 "hr" );
				 generatePassword=cs.generatePassword() ;
				 cs.showCredentials(employee, generatedEmail, generatePassword);
			}
			else if(option==4) {
				generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), 
						 "lg" );
				 generatePassword=cs.generatePassword() ;
				 cs.showCredentials(employee, generatedEmail, generatePassword);
				
			}
			else
				System.out.println("Enter a vaild option");
				
			sc.close();
		


	}

}
