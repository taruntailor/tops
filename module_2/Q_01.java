//W.A.J.P to get the character at the given index within the
//String. Original String = Tops Technologies! The character at
//position 0 is T, The character at position 10 is o
package module_2;

public class Q_01 {
	public static void main(String[] args) {
		String OriginalString = "tops Technologies!";
		int index = 10;

		if (index >= 0 && index < OriginalString.length()) {
			char characterAtIndex = OriginalString.charAt(index);
			System.out.println("The character at position " + index + " is :" + characterAtIndex);

		} else {
			System.out.println("Index is out of bounds for the given string.");

		}
	}

}
