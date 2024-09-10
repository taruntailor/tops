//Write a Java program to get the number of elements in a hash
//set.
package module_2;

import java.util.HashSet;

public class Q_044 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		int size = hashSet.size();
		System.out.println("Number of elements in the HashSet: " + size);
	}
}
