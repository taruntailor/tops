//Write a Java program to get a collection view of the
//values contained inthis map.
package module_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q_60 {
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("John", 25);
    map.put("Jane", 30);
    map.put("Doe", 40);
    Collection<Integer> values = map.values();
    System.out.println("Values in the map:");
    for (Integer value : values) {
        System.out.println(value);
    }
}
}
