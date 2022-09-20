package com.census.itsupport.services;

import java.util.Random;

public class CredentialService {
	public char[] generatePassword() {
		 String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String smallLetters="abcdefghijklmnopqrstuvwxyz";
		 String number="0123456789";
		 String specialCharacter="!@#$%^&*_+/.?<>";
		 String values=capitalLetters+smallLetters+number+specialCharacter;
		 //Using random method
		 Random random=new Random();
		 char[] password= new char[8];
		
		 for (int i=0;i<8;i++){
			 password[i]= values.charAt(random.nextInt(values.length()));
		 }
		 return password;
		 
	 }
	 	public String generateEmailAddress(String firstName, String lastName,String department)
	 	{
	 		return firstName+lastName+"@"+department+".census.com";
	 	}
	 	public void showCredentials(Employee employee,String email, char[] generatePassword) {
	 		System.out.println("Dear"+" "+employee.getFirstName()+" Your generated credential are as follows");
	 		System.out.println("Email-->"+email);
	 		System.out.println("Password-->"+""+String.valueOf(generatePassword));
	 		
	 	}
	 	
	}


