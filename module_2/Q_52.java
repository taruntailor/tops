//• Write a Java program of swap two elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_52 {
public static void main(String[] args) {
	  ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(30);
      arrayList.add(40);
      arrayList.add(50);
      
      System.out.println("real array list "+arrayList);
      swapElements(arrayList, 1, 3);
      System.out.println("ArrayList after swapping elements at index 1 and 3: " + arrayList);

}

private static void swapElements(ArrayList<Integer> arrayList, int i, int j) {
	// TODO Auto-generated method stub
    Collections.swap(arrayList, i, j);

}
}
