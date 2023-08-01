package com.revision;

class First
{
	Number num=90;
  
	Object getValue()
	{
		return num;
	}


}

class Second extends First
{
    Integer i=78;
    
    Integer getValue()
	{
		return i;
	}


}

class Third extends First
{
    Character ch='A';
    
    Character getValue()
	{
		return ch;
	}


}


public class CovariantDemo {
	
	public static void main(String[] args) {
		
		Second s= new Second();
		//System.out.println(((int)(s.getValue())+9));
		
		System.out.println((s.getValue()+9));
	}

}
