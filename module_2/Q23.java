//• W.A.J. P to implement the above program (pro.no-B27)
//using nesting oftry-catch block. try { o try o {//code} o
//catch (Exception e) o {//code} o catch (Exception e) o
//{//code}

package module_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {
	 public static void main(String[] args) {
	        try {
	           
	            try {
	            
	                BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
	                String line = reader.readLine();
	                System.out.println("First line of the file: " + line);
	                reader.close(); 
	            } catch (FileNotFoundException e1) {
	               
	                System.out.println("File not found: " + e1.getMessage());
	            } catch (IOException e2) {
	             
	                System.out.println("IOException: " + e2.getMessage());
	            }

	            try {
	            
	                String str = "123abc";
	                int number = Integer.parseInt(str);
	                System.out.println("Parsed number: " + number);
	            } catch (NumberFormatException e3) {
	              
	                System.out.println("NumberFormatException: " + e3.getMessage());
	            }

	        } catch (Exception e) {
	            // Outer catch block: Handle any other exceptions that might occur
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
}
