//Write a Java program to print all the elements of an
//ArrayList using theposition of the elements.
package module_2;

import java.util.ArrayList;

public class Q_058 {
public static void main(String[] args) {
	 ArrayList<Integer> numbers = new ArrayList<>();
     
     // Adding elements to the ArrayList
     numbers.add(10);
     numbers.add(20);
     numbers.add(30);
     numbers.add(40);
     
     System.out.println("Original ArrayList: " + numbers);
     
     // Increase size of ArrayList by adding elements
     for (int i = 0; i < 5; i++) {
         numbers.add(i);  // Adding some new elements
     }
     
     System.out.println("ArrayList after increasing size: " + numbers);
 
}
}
