//• Write a Java program to reverse elements in an array list.

package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q_49 {
public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    System.out.println("Original ArrayList: " + arrayList);
    Collections.reverse(arrayList);
    System.out.println("Reversed ArrayList (Method 1): " + arrayList);

}
   

}
