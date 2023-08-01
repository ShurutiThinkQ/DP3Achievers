package com.strings;

public class CountDigits {
	
	public static void sumDigits(String s)
	{
	    int sum=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(Character.isDigit(s.charAt(i)))
	    	{
	    		System.out.print(s.charAt(i)+"  ");
	    		sum = sum+ Integer.parseInt(String.valueOf(s.charAt(i)));
	    	}
	    }
	    System.out.println();
	    System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		String str="HJ897f90DFI";
		sumDigits(str);
	}

}
