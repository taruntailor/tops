//• Write a Java program to copy one array list into another.

package module_2;

import java.util.ArrayList;

public class Q_42 {
public static void main(String[] args) {
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    arrayList1.add(1);
    arrayList1.add(2);
    arrayList1.add(3);
    arrayList1.add(4);
    arrayList1.add(5);

    ArrayList<Integer> arrayList2 = new ArrayList<>();
    for(Integer element:arrayList1) {
    	arrayList2.add(element);
    	
    }
    
    System.out.println("your out put :"+arrayList2);

}
}
