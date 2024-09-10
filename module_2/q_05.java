/*W.A.J.P to find all interleaving of given
strings.The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX
WYXZ
*/
package module_2;

public class q_05 {

	 public static void main(String[] args) {
	        String str1 = "WX";
	        String str2 = "YZ";

	        System.out.println("Interleavings:");
	        printInterleavings(str1, str2, "", 0, 0);
	    }

	     static void printInterleavings(String str1, String str2, String result, int i, int j) {
	        if (i == str1.length() && j == str2.length()) {
	            System.out.println(result);
	            return;
	        }

	        if (i < str1.length()) {
	            printInterleavings(str1, str2, result + str1.charAt(i), i + 1, j);
	        }

	        if (j < str2.length()) {
	            printInterleavings(str1, str2, result + str2.charAt(j), i, j + 1);
	        }
	    }



}
