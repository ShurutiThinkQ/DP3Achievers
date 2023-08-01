package com.arrays;

import java.util.Arrays;

public class PairOfElements {
	
	public static void findPairElements(int ar[])
	{
		int sum=10;
		System.out.println("Pair of elements whose sum is="+sum);
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j])==sum)
				{
					System.out.println("{"+ar[i]+" , "+ar[j]+"}");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {4,5,7,8,6,1,9,2};
		
		System.out.println(Arrays.toString(arr));
		
		findPairElements(arr);
		
		
	}

}
