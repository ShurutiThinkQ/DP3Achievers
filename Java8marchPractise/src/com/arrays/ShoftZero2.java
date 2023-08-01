package com.arrays;

import java.util.Arrays;

public class ShoftZero2 {
	
	public static void shifting(int arr[])
	{
		int a1[]= new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				a1[j++]= arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				a1[j++]= arr[i];
		}
		
		System.out.println(Arrays.toString(a1));
		
	}

	public static void main(String[] args) {
		
		int arr[]= {4,-5,0,0,0,6,-1};
		
		System.out.println(Arrays.toString(arr));
		
		shifting(arr);
		
		
		
		
	}
}
