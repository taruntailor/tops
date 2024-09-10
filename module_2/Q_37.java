//Write a Java program to retrieve an element (at a
//specified index) from agiven array list.
package module_2;

import java.util.ArrayList;

public class Q_37 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("gujrat");
		arrayList.add("rajasthan");
		arrayList.add("bangle");
		arrayList.add("panjab");

		int index = 2;
		if (index >= 0 && index < arrayList.size()) {
			String element = arrayList.get(index);
			System.out.println("Element at index " + index + ": " + element);

		} else {
			System.out.println("Index " + index + " is out of bounds.");
		}
	}
}
