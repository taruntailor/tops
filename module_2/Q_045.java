//Write aa Java program to iterate through all elements in a hash
//list.a
package module_2;

import java.util.HashSet;
import java.util.Iterator;

import javax.lang.model.element.Element;

public class Q_045 {
public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();

    hashSet.add("ram");
    hashSet.add("garish");
    hashSet.add("raj");
    
    Iterator<String>iterator=hashSet.iterator();
    
  while (iterator.hasNext()) {
	String Element = (String) iterator.next();
	System.out.println(Element);
	
}
}
}
