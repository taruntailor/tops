/*Write a program to print the factorial of a number by defining
a method named 'Factorial'. Factorial of any number n is
represented by n! and is equal to 1*2*3*. *(n-1) *n. E.g.- o
4! = 1*2*3*4 = 24 o 3! = 3*2*1 = 6 o 2! = 2*1 =2 o Also,
1! = 1 o 0! = 0*/
package module_2;

import java.util.Scanner;

public class Q_018 {
	public static void main(String[] args) {
		
	    Scanner src = new Scanner(System.in);
		 System.out.println("enter your number");
	     int num = src.nextInt();
	     long result = factorial(num);
	     
	     System.out.println("The factorial of " + num + " is: " + result);


	}
	static long factorial(int n) {
	if(n==0 || n==1) {
		return 1;
	}else {
		return n*factorial(n-1);

	}
	}
}
