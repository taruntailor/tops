//Write a Java program to update specific array element by given
//element.
package module_2;

import java.util.ArrayList;

public class Q_38 {
public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<String>();

	arrayList.add("gujrat");
	arrayList.add("rajasthan");
	arrayList.add("bangle");
	arrayList.add("panjab");
	
	arrayList.set(3, "goa");
	System.out.println(arrayList);
}
}
