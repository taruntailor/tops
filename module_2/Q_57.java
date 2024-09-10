//Write a Java program to increase the size of an array list.
//Write a Java program to replace the second element of an
//ArrayList with
//the specified element.
package module_2;

import java.util.ArrayList;

public class Q_57 {
private void mian() {
	// TODO Auto-generated method stub
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

