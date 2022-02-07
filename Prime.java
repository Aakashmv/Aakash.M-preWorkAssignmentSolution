package GreatLearning;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

	    int num;
	    int i = 2;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    num=sc.nextInt();
	    boolean prime = false;
	    while (i <= num / 2) {
	      if (num % i == 0) {
	        prime = true;
	        break;
	      }

	      ++i;
	    }

	    if (!prime)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}

