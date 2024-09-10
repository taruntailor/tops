//Write a Java program to count the number of key-value
//(size) mappingsin a map.
package module_2;

import java.util.HashMap;
import java.util.Map;

public class q_48 {
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    
    int size = map.size();
    System.out.println("Number of key-value mappings in Map: " + size);
}
}
