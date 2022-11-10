package javabasicprogram;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		int n,rem,reverse=0,temp;
		Scanner sc=new Scanner(System.in);
		//input number from user
		System.out.println("Enter number to count");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			
		}
		System.out.println("reverse of "+temp+" is:"+reverse);
		
	}

}
