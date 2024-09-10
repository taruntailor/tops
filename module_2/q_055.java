//• Write a Java program to convert a hash set to a List/ArrayList.
package module_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q_055 {
public static void main(String[] args) {
	 HashSet<String> hashSet = new HashSet<>();
	 hashSet.add("Apple");
     hashSet.add("Banana");
     hashSet.add("Orange");
     hashSet.add("Grapes");
     List<String> arrayList = new ArrayList<>(hashSet);
     System.out.println("Elements in the ArrayList:");
     for (String element : arrayList) {
         System.out.println(element);
     }
}
}
