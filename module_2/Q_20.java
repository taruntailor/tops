//W.A.J. P to demonstrate try catch block,
package module_2;

public class Q_20 {
public static void main(String[] args) {
	int namerator=10;
	int denomirator=0;
	int result;
	
	  try {
		  result = namerator / denomirator;
	       System.out.println("The result is: " + result);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error: zero is not allowed");
	}
       
       System.out.println("Program continues ");
}
}
