package com.census.itsupport.services;
import java.util.Random;

public class Employee {
	private String firstName;
	private String lastName;
	     public Employee(String firstName,String lastName) 
	     {
	    	 this.firstName=firstName;
	    	 this.lastName=lastName;
		
	     }
	     public String getFirstName() 
	     {
	    	 return firstName;
	     }
	     public void setFirstName(String firstName)
	     {
	    	 this.firstName=firstName;
	     }
	     public String getLastName() 	
	     {
	    	 return lastName;
	     }
	     public void setlastName(String lastName)
	     {
	    	 this.lastName=lastName;
	     }

}
