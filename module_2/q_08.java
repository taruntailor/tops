/*
 * Create a class to print an integer and a character with two
methods having the same name but different sequence of the
integer and the character parameters. For example, if the
parameters of the first method are of the form(int n, char c),
then that of the second method will be of the form (char c,
intn).*/
package module_2;
class PrintIntegerAndChar {
	void printValues(int n, char c) {
		System.out.println("Printing values: Integer = " + n + ", Character = " + c);

	}

	void printValues(char c, int n) {
		System.out.println("Printing values: Character = " + c + ", Integer = " + n);
	}
}
public class q_08 {
	public static void main(String[] args) {
        PrintIntegerAndChar printer = new PrintIntegerAndChar();
        printer.printValues(42, 'A');
        printer.printValues('B', 123);
	}
}
