package com.arrays;

import java.util.Arrays;

public class MaxMinSwap {
	
	public static void  findMaxMin(int arr[])
	{
		//int arr1[]= new int[arr.length];
		//arr1=Arrays.copyOf(arr, arr.length);
		int max= arr[0];
		int min= arr[0];
		int posmax=0,posmin=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
				posmax=i;
			}
			
			if(arr[i]<min)
			{
				min= arr[i];
				posmin=i;
			}
			
		}
		System.out.println("Max number :"+max);
		System.out.println("Min number :"+min);
		
		// swapping
		
		int temp= arr[posmax];
		arr[posmax]= arr[posmin];
		arr[posmin]= temp;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,9,7,8,1,2};
		//        ={5,6,1,7,8,9,2}
		//         ={9,2,5,6,7,8,1}
		
		System.out.println(Arrays.toString(arr));
		
		findMaxMin(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
