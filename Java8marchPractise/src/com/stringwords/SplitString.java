package com.stringwords;

import java.util.Arrays;

public class SplitString {
	
	
	public static void calcspiltStrings(String st, int noOfc)
	{
		int len= st.length();
		int size= len/noOfc;
		String sar[]= new String[size];
		
		int index=0;
		
		for(int i=0;i<len;i+=noOfc)
		{
			sar[index]= st.substring(i, i+noOfc);
			index++;
		}
		
		System.out.println(Arrays.toString(sar));
	}
	
	public static void main(String[] args) {
		
		String str="Programming"; // length-11
		
		System.out.println(str);
		
		int noOfchars=5;
		
		if(str.length()%noOfchars !=0)
		{
			int x=noOfchars- (str.length()%noOfchars); // no of chars added
			for(int i=0;i<x;i++)
			{
				str=str.concat("#");
			}
			
			
		}
		
		calcspiltStrings(str,noOfchars);
		
	}

}
