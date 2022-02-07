package GreatLearning;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {

	    int n, first = 0, second = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    n=sc.nextInt();
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(first + ", ");
	      int next = first + second;
	      first = second;
	      second = next;
	    }
	  }
	}
