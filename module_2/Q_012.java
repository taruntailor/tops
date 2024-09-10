package module_2;
class Rectangle {
	 private double length;
	    private double breadth;
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    public void calculateArea() {
	        double area = length * breadth;
	        System.out.println("Rectangle Area: " + area);
	    }
	    public void calculatePerimeter() {
	        double perimeter = 2 * (length + breadth);
	        System.out.println("Rectangle Perimeter: " + perimeter);
	    }
	    
}
class Square extends Rectangle {
   public Square(double side) {
       super(side, side);
   }
}

public class Q_012 {
	
	 public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(4, 6);
	        rectangle.calculateArea();
	        rectangle.calculatePerimeter();

	        Square square = new Square(5);
	        square.calculateArea();
	        square.calculatePerimeter();
	    }


}
