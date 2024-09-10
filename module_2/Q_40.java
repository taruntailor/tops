//• Write a Java program to search an element in an array list.

package module_2;

import java.util.ArrayList;

public class Q_40 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("gujrat");
		arrayList.add("rajasthan");
		arrayList.add("bangle");
		arrayList.add("panjab");
		
		System.out.println("element at index : " + arrayList.get(3));

	}

}
