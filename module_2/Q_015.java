/*
 * • Create an abstract class 'Parent' with a method 'message'. It
has two subclasseseach having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively. Call the methods 'message' by creating
an object for each subclass.*/
package module_2;
abstract class Parent{
	abstract void massage();
	
}
class FirstSubclass extends Parent{

	@Override
	void massage() {
        System.out.println("This is the first subclass");
		
	}
	
}
 class SecondSubclass extends Parent {

	@Override
	void massage() {
		  System.out.println("This is the second subclass");		
	}
}
public class Q_015 {
	public static void main(String[] args) {
        FirstSubclass firstObj = new FirstSubclass();
        firstObj.massage();

        SecondSubclass secondObj = new SecondSubclass();
        secondObj.massage();


	}
}
