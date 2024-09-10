/*Write a program to print the area and perimeter of a triangle
having sides of 3, 4 and 5 units by creating a class named
'Triangle' without any parameter in itsconstructor.*/
package module_2;
class Triangle {
	 double side1, side2, side3;

	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
	  public double calculateArea() {
		  double s = (side1 + side2 + side3) / 2;
	        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	        return area;
	}
	   public double calculatePerimeter() {
		   double perimeter = side1 + side2 + side3;
	        return perimeter;
	   
}
	   public void displayTriangleInfo() {
	        double area = calculateArea();
	        double perimeter = calculatePerimeter();

	        System.out.println("Triangle with sides " + side1 + ", " + side2 + ", and " + side3 + " units:");
	        System.out.println("Area: " + String.format("%.2f", area) + " square units");
	        System.out.println("Perimeter: " + perimeter + " units");
	    }
}

public class Q_013 {
	 public static void main(String[] args) {
	        Triangle triangleInstance = new Triangle();

	        // Displaying the area and parameter of the triangle
	        triangleInstance.displayTriangleInfo();
	    }
}
