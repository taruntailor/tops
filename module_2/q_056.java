//Write a Java program to check whether a map contains
//key-valuemappings (empty) or not.

package module_2;

import java.util.HashMap;
import java.util.Map;

public class q_056 {
public static void main(String[] args) {
	 Map<String, Integer> map = new HashMap<>();
     
     // Check if the map is empty
     if (map.isEmpty()) {
         System.out.println("Map is empty");
     } else {
         System.out.println("Map is not empty");
     }
     
     // Add some key-value pairs to the map
     map.put("apple", 10);
     map.put("banana", 20);
     map.put("orange", 30);
     
     // Check again after adding elements
     if (map.isEmpty()) {
         System.out.println("Map is empty");
     } else {
         System.out.println("Map is not empty");
     }
}
}
