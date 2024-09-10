/*• W.A.J.P to concatenate a given string to the end of another string.
*/
package module_2;

public class q_02 {
	public static void main(String[] args) {
		String Original="hello";
		String Given="name";
		String result0 = Original+Given;
		String result1 = Original.concat(Given);
		
		
		System.out.println("using result + operator "+result0);
		System.out.println("using resut concat()method: "+result1);
	}

}
