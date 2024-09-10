//Write a Java program to remove the third element from an
//array list
package module_2;

import java.util.ArrayList;

public class q_39 {
public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<String>();

	arrayList.add("gujrat");
	arrayList.add("rajasthan");
	arrayList.add("bangle");
	arrayList.add("panjab");
	
	arrayList.remove(2);
	System.out.println(arrayList);
}
}
