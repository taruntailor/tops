/*• Create a class to print the area of a square and a rectangle.
The class has twomethods with the same name but different
number of parameters. The method for printing area of a
rectangle has two parameters which are length and breadth
respectively while the other method for printing area of
square has one parameter which is side of square*/
package module_2;
class AreaCalculator {
	void  calculateArea(double lenght,double breadth) {
		double area=lenght*breadth;
		System.out.println("area of rectangle"+area);
		
	}
	void calculateArea(double side) {
		double area = side*side;
		
		System.out.println("ara of squre"+area);
	}
}
public class Q_09 {
public static void main(String[] args) {
	 AreaCalculator calculator = new AreaCalculator();
     calculator.calculateArea(5.0, 8.0);
     calculator.calculateArea(4.0);     
}
}
