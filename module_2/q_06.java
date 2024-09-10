/*W.A.J.P to find the second most frequent character in a given
string. The given string is: successes The second most
frequent char in the string is: c
*/
package module_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class q_06 {
	 public static void main(String[] args) {
	        String inputString = "successes";
	        char result = findSecondMostFrequentChar(inputString);
	        System.out.println("The second most frequent char in the string is: " + result);
	    }

	    private static char findSecondMostFrequentChar(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        int maxCount = Integer.MIN_VALUE;
	        int secondMaxCount = Integer.MIN_VALUE;
	        char maxChar = '\0';
	        char secondMaxChar = '\0';

	        for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            char currentChar = entry.getKey();
	            int currentCount = entry.getValue();

	            if (currentCount > maxCount) {
	                secondMaxCount = maxCount;
	                secondMaxChar = maxChar;
	                maxCount = currentCount;
	                maxChar = currentChar;
	            } else if (currentCount > secondMaxCount && currentCount < maxCount) {
	                secondMaxCount = currentCount;
	                secondMaxChar = currentChar;
	            }
	        }

	        return secondMaxChar; 
	    }
}
