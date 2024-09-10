//Write a Java program to sort a given array list.
package module_2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q_41 {
public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("gujrat");
	arrayList.add("rajasthan");
	arrayList.add("bangle");
	arrayList.add("panjab");
	
	Collections.sort(arrayList);
	System.out.println(arrayList);
}
}
