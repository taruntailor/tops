//Write a Java program to compare two array lists.
package module_2;

import java.util.ArrayList;

public class Q_51 {
public static void main(String[] args) {
	  ArrayList<String> list1 = new ArrayList<>();
      ArrayList<String> list2 = new ArrayList<>();
      list1.add("Apple");
      list1.add("Banana");
      list1.add("Cherry");

      list2.add("Apple");
      list2.add("Banana");
      list2.add("Cherry");
      System.out.println("List 1: " + list1);
      System.out.println("List 2: " + list2);
      if (list1.equals(list2)) {
          System.out.println("List 1 and List 2 are equal");
      } else {
          System.out.println("List 1 and List 2 are not equal");
      }
}
}
