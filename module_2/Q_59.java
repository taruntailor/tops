//Write a Java program to compare two sets and retain
//elements which aresame on both sets
package module_2;

import java.util.HashSet;
import java.util.Set;

public class Q_59 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);

		Set<Integer> commonElements = new HashSet<>(set1);
		commonElements.retainAll(set2);
		System.out.println("Common elements between set1 and set2: " + commonElements);

	}
}
