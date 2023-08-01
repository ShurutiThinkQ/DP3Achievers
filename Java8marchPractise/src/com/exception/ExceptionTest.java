package com.exception;

import java.util.Scanner;


public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your id :");
		s.setEid(sc.nextInt());
		
		try {
			System.out.println("Enter your name");
			String name = sc.next();
			if (name.length() < 3) {
				throw new InvalidNameException("Name length should be greater than 2");
			} else
				s.setName(name);

		} catch (Exception e) {
			System.out.println(e);
		}
		
		try
		{
		System.out.println("Enter marks:");
	    float m= sc.nextFloat();
	    if(m>100 || m<0)
	    	throw new InvalidMarksException("Marks should be between 0 an 100");
	    else
	    	s.setMarks(m);
	    
	   
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		 System.out.println(s);
	}

}
