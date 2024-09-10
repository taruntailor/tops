// W.A.J. P to demonstrate multiple catch blocks, (one is to
//handle divide by zero exception and another one is to
//handle o Array IndexOutOfBoundException) int a [] =new
//int [5]; a [5]=30/0;
package module_2;

public class Q_022 {
	public static void main(String[] args) {
		int []a =new int [5];
		
		try {
			a[5]=3/5;
			
		} catch (ArithmeticException  e) {
            System.out.println(" java.lang.ArithmeticException: / by zero");
		}catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(".lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5");
		}
		
		
		   try {
	            // This will throw an ArrayIndexOutOfBoundsException
	            a[5] = 10;
	        } catch (ArithmeticException e) {
	            System.out.println("   lang.ArithmeticException: / by zero");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5");
	        }

	        System.out.println("Program continues  try-catch blocks.");
	}

}
