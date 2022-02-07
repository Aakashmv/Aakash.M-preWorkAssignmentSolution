package GreatLearning;

import java.util.Scanner;

//import java.util.*;
public class RevNum {
	public static void main(String args[])
	{
		int number; 
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter a number");
		number=sc.nextInt();
		int temp = number;
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		if(temp == reverse)
		{
			System.out.println("Number is palindrom");
			
		}
		else
		{ 
			System.out.println("Not a palindrom");
		}
		}  
		}  