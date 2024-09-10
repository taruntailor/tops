//TestDaemonThre
//ad2
//t1=ne
//w
//TestDaemonThread2(); o
//TestDaemonThread
//2
//t2=new TestDaemonThread2();
//t1.start
//()
//o
//t1.setDaemon(true);//will throw exception here t2.start();
//Write a Java program to create a new array list, add some
//colours (string)and print out the collection
package module_2;

import java.util.ArrayList;

public class Q35 {
public static void main(String[] args) {
	  ArrayList<String> colors = new ArrayList<>(); 
	  colors.add("green");
	  colors.add("Green");
      colors.add("Blue");
      colors.add("Yellow");
      colors.add("Orange");
      System.out.println("List of Colors:");
      for (String color : colors) {
          System.out.println(color);
      } 
}
}
