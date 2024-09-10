//W.A.J. P to demonstrate multiple catch blocks, (one is to
//handle divide by zero exception and another one is to
//handle o Array IndexOutOfBoundException) int a [] =new
//int [5]; a [5]=30/0;
package module_2;

public class Q_22 {
public static void main(String[] args) {
    int[] a = new int[5];

	   try {
           a[5] = 30 / 0; 
       } catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception occurred: Division by zero is not allowed.");
           e.printStackTrace();
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Array Index Out Of Bounds Exception occurred: Index exceeds array size.");
           e.printStackTrace(); 
       } catch (Exception e) {
           System.out.println("Exception occurred: " + e.getMessage());
           e.printStackTrace();
       }
}
}
