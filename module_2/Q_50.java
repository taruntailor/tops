//• Write a Java program to extract a portion of an array list.

package module_2;

import java.util.ArrayList;
import java.util.List;

public class Q_50 {
public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    arrayList.add("Date");
    arrayList.add("Fig");
    System.out.println("Original ArrayList: " + arrayList);
    List<String> extractedList = arrayList.subList(1, 4);
    ArrayList<String> extractedArrayList = new ArrayList<>(extractedList);
    System.out.println("Extracted ArrayList (using subList()): " + extractedArrayList);

}
}
