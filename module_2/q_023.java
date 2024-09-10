//W.A.J. P to implement the above program (pro.no-B27)
//using nesting oftry-catch block. try { o try o {//code} o
//catch (Exception e) o {//code} o catch (Exception e) o
//{//code}
package module_2;

public class q_023 {
	 public static void main(String[] args) {
	        try {
	            // Outer try block
	            try {
	                System.out.println("Inner try block 1");
	                int result = 10 / 0; 
	            } catch (ArithmeticException e) {
	                System.out.println("Caught ArithmeticException in inner try block 1: " + e.getMessage());
	            }

	            try {
	                // Inner try block 2
	                System.out.println("Inner try block 2");
	                int[] array = new int[5];
	                array[10] = 50; 
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Caught ArrayIndexOutOfBoundsException in inner try block 2: " + e.getMessage());
	            }

	        } catch (Exception e) {
	            System.out.println("Caught Exception in outer try block: " + e.getMessage());
	        }
	    }
}
