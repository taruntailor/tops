//Write a Java program to join two array lists.
package module_2;

import java.util.ArrayList;

public class Q_54 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Grapes");
		list2.add("Pineapple");
		System.out.println("First ArrayList: " + list1);
		System.out.println("Second ArrayList: " + list2);
		list1.addAll(list2);
		System.out.println("Joined ArrayList: " + list1);

	}
}
