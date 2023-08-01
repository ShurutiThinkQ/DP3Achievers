package com.strings;

import java.util.Arrays;

public class Anargram {
	
	public static boolean checkAnagram(String s1,String s2)
	{
		boolean status=true;
		
		if(s1.length()!=s2.length())
			status=false;
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char c1[]= s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(!Arrays.equals(c1, c2))
			{
				status=false;
			}
							
		}
			
		return status;
		
	}
	
	public static void main(String[] args) {
		
		String s1="silent";
		String s2="Listeb";
		
		System.out.println(s1+"   "+s2);
		
		if(checkAnagram(s1, s2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
		
	}

}
