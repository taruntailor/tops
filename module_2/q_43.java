//• Write a Java program to shuffle elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class q_43 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("real array list :"+arrayList);
		Collections.shuffle(arrayList);
		System.out.println("suhffle array list :"+arrayList);

	}
}
