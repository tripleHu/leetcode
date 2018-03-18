package String;

import java.util.HashMap;

public class romanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("DCXXI"));
	}
	public static int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashMap<String, Integer> numMap = new HashMap<String, Integer>();
        numMap.put("I", 1);
        numMap.put("II", 2);
        numMap.put("III", 3);
        numMap.put("IV", 4);
        numMap.put("V", 5);
        numMap.put("VI", 6);
        numMap.put("VII", 7);
        numMap.put("VIII", 8);
        numMap.put("IX", 9);
        numMap.put("X", 10);
        numMap.put("XX", 20);
        numMap.put("XXX", 30);
        numMap.put("XL", 40);
        numMap.put("L", 50);
        numMap.put("LX", 60);
        numMap.put("LXX", 70);
        numMap.put("LXXX", 80);
        numMap.put("XC", 90);
        numMap.put("C", 100);
        numMap.put("CC", 200);
        numMap.put("CCC", 300);
        numMap.put("CD", 400);
        numMap.put("D", 500);
        numMap.put("DC", 600);
        numMap.put("DCC", 700);
        numMap.put("DCCC", 800);
        numMap.put("CM", 900);
        numMap.put("M", 1000);
        numMap.put("MM", 2000);
        numMap.put("MMM", 3000);
        int len = sb.length();
        
        if(sb.length() == 1) return numMap.get(s);
        int result = numMap.get(String.valueOf(sb.charAt(sb.length() - 1)));
        for(int i = sb.length() - 1; i > 0; i--){
            if(numMap.get(String.valueOf(sb.charAt(i))) <= numMap.get(String.valueOf(sb.charAt(i - 1)))){
                result = result + numMap.get(String.valueOf(sb.charAt(i - 1)));
            }
            else{
                result = result + (-1) * numMap.get(String.valueOf(sb.charAt(i - 1)));
            }
        }
        return result;
    }
}
