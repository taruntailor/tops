/*Create a class named 'Shape' with a method to print "This
is this is shape". Then create two other classes named
'Rectangle', 'Circle' inheriting the Shape
class, both having a method to print "This is rectangular
shape" and "This is circular shape" respectively. Create a
subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and
'Rectangle' class by the object of 'Square' class.*/
package module_2;
class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}
class Rect extends Shape {
	public void printRectangle() {
		System.out.println("This is a rectangular shape");
	}
}

class Circle extends Shape {
	public void printCircle() {
		System.out.println("This is a circular shape");
	}
}

class Squ extends Rect {
	public void printSquare() {
		System.out.println("Square is a rectangle");
	}
}

public class Q_019 {
	public static void main(String[] args) {
		Squ square = new Squ();
		square.printSquare();
		square.printRectangle();
	}

}
