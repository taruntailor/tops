///* W.A.J. P to demonstrate try catch block, take two numbers
////from the userby Command line argument and perform the
////division operation and handle Arithmetic o O/P-
package module_2;

public class Q_025 {
	  public static void main(String[] args) {
	        // Check if two arguments are provided
	        if (args.length != 2) {
	            System.out.println("Please provide exactly two numbers as command-line arguments.");
	            return;
	        }

	        try {
	            // Parse the command-line arguments to integers
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);

	            try {
	                // Perform the division operation
	                int result = num1 / num2;
	                System.out.println("Result of division: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("ArithmeticException: Division by zero is not allowed.");
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException: Please ensure both command-line arguments are valid integers.");
	        }
	    }
}
