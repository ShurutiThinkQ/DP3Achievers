package com.exception;

import java.util.Scanner;

class Student {
	private int eid;
	private String name;
	private float marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int eid, String name, float marks) {
		super();
		this.eid = eid;
		this.name = name;
		this.marks = marks;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your id :");
		s.setEid(sc.nextInt());
		
		System.out.println("Enter your name");
	    String name= sc.next();
	    if(name.length()<3)
	    {
	    	throw new InvalidNameException("Name length should be greater than 2");
	    }
	    else
	    	s.setName(name);
	    
	    System.out.println("Enter marks:");
	    float m= sc.nextFloat();
	    if(m>100 || m<0)
	    	throw new InvalidMarksException("Marks should be between 0 an 100");
	    else
	    	s.setMarks(m);
	    
	    System.out.println(s);
	    
	
		
		
		
	}

}
