//Take two numbers from the user and perform the division
//operation andhandle Arithmetic Exception. O/P- Enter two
//numbers: 10 0 o Exception in thread main
//java.lang.ArithmeticException:/ by zero
package module_2;

import java.util.Scanner;

public class Q21 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   try {
	   System.out.print("Enter two numbers: ");
	    int num1 = scanner.nextInt();
	    int num2 = scanner.nextInt();
	    int result = num1 / num2;
	    System.out.println("Result of division: " + result);
   }
   catch (ArithmeticException e) {
       System.out.println("Exception occurred: Division by zero is not allowed.");
       e.printStackTrace(); 
       
   } catch (Exception e) {
       
       System.out.println("Exception occurred: " + e.getMessage());
       e.printStackTrace(); 
       
   } finally {
       scanner.close(); 
   }
   
}
}