/*Print the sum, difference and product of two complex numbers
by creating a class named 'Complex' with separate methods
for each operation whose real and imaginary parts are entered
by user*/
package module_2;

import java.lang.reflect.Method;
import java.util.Scanner;

class Complex {
	 private double realPart;
	    private double imaginaryPart;

	    public Complex(double realPart, double imaginaryPart) {
	        this.realPart = realPart;
	        this.imaginaryPart = imaginaryPart;
	    }

	    public Complex add(Complex other) {
	        double resultReal = this.realPart + other.realPart;
	        double resultImaginary = this.imaginaryPart + other.imaginaryPart;
	        return new Complex(resultReal, resultImaginary);
	    }

	    public Complex subtract(Complex other) {
	        double resultReal = this.realPart - other.realPart;
	        double resultImaginary = this.imaginaryPart - other.imaginaryPart;
	        return new Complex(resultReal, resultImaginary);
	    }

	    public Complex multiply1(Complex other) {
	        double resultReal = (this.realPart * other.realPart) - (this.imaginaryPart * other.imaginaryPart);
	        double resultImaginary = (this.realPart * other.imaginaryPart) + (this.imaginaryPart * other.realPart);
	        return new Complex(resultReal, resultImaginary);
	    }
	    public String toString() {
	        return this.realPart + " + " + this.imaginaryPart + "i";
	    }

	public Complex multiply(Complex complex2) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Q_014 {
	public static void main(String[] args) {
		 Complex num1 = new Complex(3, 2);  // 3 + 2i
	        Complex num2 = new Complex(1, 4);  // 1 + 4i
	        
	        Complex sumResult = num1.add(num2);
	        System.out.println("Sum: " + sumResult);
		
	        Complex diffResult = num1.subtract(num2);
	        System.out.println("Difference: " + diffResult); 

	        Complex productResult = num1.multiply(num2);
	        System.out.println("Product: " + productResult); 

		
	}

}
