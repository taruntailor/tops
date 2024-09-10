/*We have to calculate the percentage of marks obtained in
three subjects (each out of 100) by student A and in four
subjects (each out of 100) by student B. Create an abstract
class 'Marks' with an abstract method 'getPercentage'. It is
inherited by two other classes 'A' and 'B' each having a method
with the same name which returns the percentage of the
students. The constructor of studentA takes the marks in three
subjects as its parameters and the marks in four subjects as
its parameters for student B. Create an object for each of the
two classes and print the percentage of marks for both the
students.
*/
package module_2;
abstract class Marks {

	abstract double getPercentage();
}

class a extends Marks {

	private int sub1, sub2, sub3;

	a(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;

	}

	double getPercentage() {
		return (sub1 + sub2 + sub3) / 3.0;

	}
}

class b extends Marks {
	private int sub1, sub2, sub3, sub4;

	b(int sub1, int sub2, int sub3, int sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;

	}

	double getPercentage() {
		return (sub1 + sub2 + sub3 + sub4) / 4.0;

	}
}

public class Q_017 {
	public static void main(String[] args) {
		a studentA = new a(90, 85, 78);
		b studentB = new b(88, 92, 78, 85);

		System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
		System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");

	}
}
