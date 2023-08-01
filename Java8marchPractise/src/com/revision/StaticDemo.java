package com.revision;

public class StaticDemo {
	
	int x;
	static int y;
	
	
	void methodOne()
	{
		x=10;
		y=90;
		
		
	}
	
	static void methodTwo()
	{
	  StaticDemo s1= new StaticDemo();
	  s1.x=89;
	   y=23;
	}
	public static void main(String[] args) {
		
		System.out.println("In main");
		main("Java");
		
	}
	
	public static void main(String s)
	{
		System.out.println("String main");
	}

}
