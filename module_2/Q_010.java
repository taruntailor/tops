/*Create a class with a method that prints "This is a parent class"
and its subclasswith another method that prints "This is child
class". Now, create an object foreach of the class and call 1 -
method of parent class by object of parent class 2
- method of child class by object of child class 3 - method of
parent class by object of child class
*/ package module_2;

class ParentClass {
	
	void Parent() {
		System.out.println("this is a parent classes");
	}
	
}
class ChildClass extends ParentClass {
    void childMethod() {
        System.out.println("This is a child class");
    }
}  
public class Q_010 {
	public static void main(String[] args) {
	    ParentClass parentObj = new ParentClass();
	    parentObj.Parent();

	    ChildClass childObj = new ChildClass();
	    childObj.childMethod();

	}
}
