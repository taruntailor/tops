//• Write a Java program to append the specified element to
//the end of a hashset.
package module_2;

import java.util.HashSet;

public class Q_44 {
	public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
       hashSet.add("orange");
       
       System.out.println("hash set array list print"+hashSet);
       
       hashSet.add("graps");
       System.out.println("HashSet after appending '" + "graps" + "': " + hashSet);

	}

}
