package com.strings;

import java.util.Arrays;

public class StringArraySort {
	
	public static void sortStringArray(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i].length() != arr[j].length()) 
				{
					if (arr[i].length() > arr[j].length())
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
				else
				{
					if(arr[i].compareTo(arr[j])>1)
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		String str[]= {"Java","C","C++","Angular","Python","Devops"};
		
		// sort on the basis of length and if length equal 
		
		System.out.println(Arrays.toString(str));
		
		sortStringArray(str);
		
		System.out.println(Arrays.toString(str));
		
	}
	
}
