/*Create a class named 'PrintNumber' to print various numbers
of different datatypes by creating different methods with the
same name 'printn' having a parameter for each data type.*/
package module_2;
class PrintNumber {

	  public void printn(int number) {
	        System.out.println("Printing integer number: " + number);
	    }
	    public void printn(double number) {
	        System.out.println("Printing double number: " + number);
	    }
	    public void printn(float number) {
	        System.out.println("Printing float number: " + number);
	    }
	    public void printn(long number) {
	        System.out.println("Printing long number: " + number);
	    }
	    public void printn(short number) {
	        System.out.println("Printing short number: " + number);
	    }
	    public void printn(byte number) {
	        System.out.println("Printing byte number: " + number);
	    }
	    public void printn(boolean value) {
	        System.out.println("Printing boolean value: " + value);
	    }
	    public void printn(char character) {
	        System.out.println("Printing character: " + character);
	    }

}
public class q_007 {
	
	public static void main(String[] args) {
		PrintNumber printer   = new PrintNumber();
		  printer.printn(42);
	      printer.printn(3.14);
	      printer.printn(2.5f);
	      printer.printn(10000000000L);
	      printer.printn((short) 10);
	      printer.printn((byte) 5);
	      printer.printn(true);
	      printer.printn('A');
	  }

}
