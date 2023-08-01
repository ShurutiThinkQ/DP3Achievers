package com.stringwords;

import java.util.Arrays;

public class FreqWords {
	
	public static void findFreq(String s)
	{
		s= s.toLowerCase();
		String str[]= s.split(" ");
	//	System.out.println(Arrays.toString(str));
		
		int count;
		int max=0;
		String ms=null;
		for(int i=0;i<str.length;i++)
		{
			
			if(str[i].equals("visited"))
				continue;
			count=1;
			
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="visited";
				}
			}
			if(max<count)
			{
			  max= count;	
			   ms= str[i];
			   
			}
		}
		System.out.println("The most repeated word is :"+ms );
		
	}
	
	public static void main(String[] args) {
		
		String s1="My wish is not your wish it is always my wish";
		
		// my-2
		//wish-3
		//is 2
		//....
		
		findFreq(s1);
		
	}

}
