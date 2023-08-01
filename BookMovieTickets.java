package com.enumdemo;

import java.util.Scanner;

public class BookMovieTickets {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter ticket type:");
		System.out.println("1. Standard  , 2. Premium , 3.Recliner");
		int seatType= sc.nextInt();
		
		System.out.println("Enter number of seats:");
		int no= sc.nextInt();
		
		MovieTicket ms= null;
		
		switch(seatType)
		{
		case 1: ms= MovieTicket.STANDARD;
		            break;
		case 2: ms= MovieTicket.PREMIUM;
		        break;
		case 3: ms= MovieTicket.RECLINER;
		        break;
		 default: System.out.println("error........");       
		}
		
		System.out.println("Total price of "+ no+" tickets of type "+ ms+" is:"+ (no*(ms.price)));
		
		sc.close();
	}

}
