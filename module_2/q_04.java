/*W.A.J.P to check whether a given string ends with the
contents of another string. "Java Exercises" ends with "se"?
False "Java Exercise" ends with "se"? True*/
package module_2;

public class q_04 {
	public static void main(String[] args) {
        String mainString1  = "Java Exercises";
        String endString1  = "se";
        boolean result = mainString1.endsWith(endString1 );
        System.out.println(mainString1 + " ends with " + endString1 + "? " + result);

		String mainString2  = "Java Exercise";
		String endString2  = "se";
		boolean result2 = mainString2.endsWith(endString2);
        System.out.println(mainString2 + " ends with " + endString2 + "? " + result2);
	}

}
