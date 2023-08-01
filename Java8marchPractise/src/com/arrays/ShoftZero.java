package com.arrays;

import java.util.Arrays;

public class ShoftZero {
	
	public static void shifting(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if((arr[i]!=0)&& i<j)
				{
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {4,-5,0,0,0,6,-1};
		
		System.out.println(Arrays.toString(arr));
		
		shifting(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
