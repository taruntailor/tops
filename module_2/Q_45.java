//Write a Java program to associate the specified value
//with the specifiedkey in a HashMap.
package module_2;

import java.util.HashMap;

public class Q_45 {

	public static void main(String[] args) {
		 HashMap<Integer, String> hashMap = new HashMap<>();
		    hashMap.put(1, "One");
	        hashMap.put(2, "Two");
	        hashMap.put(3, "Three");
	        
	        
	        System.out.println("HashMap before association: " + hashMap);
            
	        hashMap.put(4, "four");
	        System.out.println("HashMap after association: " + hashMap);

	}
}
