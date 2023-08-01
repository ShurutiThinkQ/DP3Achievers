package com.arrays;

import java.util.Arrays;

public class SecondHighest {
	
	public static int findSecondHighest(int ar[])
	{
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;	
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				smax= max;
				max=ar[i];
			}
			
			if(ar[i]<max && ar[i]>smax)
			{
				smax= ar[i];
			}
			
		}
		
		
		return smax;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {4,5,7,8,6,1,9};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second highest number is :"+findSecondHighest(arr));
		
		
	}

}
