//Take two numbers from the user and perform the division
//operation andhandle Arithmetic Exception. O/P- Enter two
//numbers: 10 0 o Exception in thread main
//java.lang.ArithmeticException:/ by zero
package module_2;

import java.util.Scanner;

public class Q_021 {
	public static void main(String[] args) {
		Scanner  src = new Scanner(System.in);
		int numerator;
		int denominator;
		int result;
		
		System.out.println("enter tow number");
		numerator=src.nextInt();
		denominator=src.nextInt();
		
		try {
			result=numerator/denominator;
			System.out.println("your result:"+result);
		} catch (Exception e) {
  System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}
}
