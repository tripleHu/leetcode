package String;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

	A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
	
	
	
	Example:
	
	Input: "23"
	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	Note:
	
	Although the above answer is in lexicographical order, your answer could be in any order you want.
 * @author triple
 *
 */
public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LetterCombinationsofaPhoneNumber().letterCombinations("23");
	}
	public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        backtrack(res, digits, "");
        return res;
    }
    private void backtrack(List<String> res, String digits,String tempStr){
        if(digits.trim().length() == 0) res.add(tempStr);
        else{
            char temp =  digits.charAt(0);
            int [] startAndEnd = getStartandEnd(temp);
            int start = startAndEnd[0];
            int end = startAndEnd[1];
            for(int i = start; i <= end; i ++){
                char addchar = (char) ('a' + i);
                backtrack(res, digits.substring(1), tempStr + addchar);
            }
        }
        
    }
    private int[] getStartandEnd(char num){
        int [] res = new int [2];
        int n = Character.getNumericValue(num);
        int start = 0;
        int end = 0;
        if(n < 7){
            start = (n - 1) * 3 - 3;
            end = (n - 1) * 3 - 1;
        }
        if(n == 7){
            start = 15;
            end = 18;
        }
        if(n == 8){
            start = 19;
            end = 21;
        }
        if(n == 9){
            start = 22;
            end = 25;
        }
        res[0] = start;
        res[1] = end;
        return res;
    }
}
