//• Write a Java program to convert a hash set to an array.

package module_2;

import java.util.HashSet;

public class q_53 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		// Add elements to the HashSet
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		String[] array = new String[hashSet.size()];
		hashSet.toArray(array);

		System.out.println("Elements in the array:");
		for (String element : array) {
			System.out.println(element);
		}
	}
}
