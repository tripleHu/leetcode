package String;

import java.util.HashMap;

public class integer_to_roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(318));
	}
	public static String intToRoman(int num) {
		String reString = "";
        HashMap<Integer, String> numMap = new HashMap<Integer, String>();
        numMap.put(1, "I");
        numMap.put(2, "II");
        numMap.put(3, "III");
        numMap.put(4, "IV");
        numMap.put(5, "V");
        numMap.put(6, "VI");
        numMap.put(7, "VII");
        numMap.put(8, "VIII");
        numMap.put(9, "IX");
        numMap.put(10, "X");
        numMap.put(20, "XX");
        numMap.put(30, "XXX");
        numMap.put(40, "XL");
        numMap.put(50, "L");
        numMap.put(60, "LX");
        numMap.put(70, "LXX");
        numMap.put(80, "LXXX");
        numMap.put(90, "XC");
        numMap.put(100, "C");
        numMap.put(200, "CC");
        numMap.put(300, "CCC");
        numMap.put(400, "CD");
        numMap.put(500, "D");
        numMap.put(600, "DC");
        numMap.put(700, "DCC");
        numMap.put(800, "DCCC");
        numMap.put(900, "CM");
        numMap.put(1000, "M");
        numMap.put(2000, "MM");
        numMap.put(3000, "MMM");
        int n = num;
        if(n % 10 != 0){
        	reString = numMap.get(n % 10)+ reString;
        }
        if((n / 10) % 10 != 0){
        	reString = numMap.get((n / 10) % 10 * 10)+ reString;
        }
        if((n / 100) % 10 != 0){
        	reString = numMap.get((n / 100) % 10 * 100)+ reString;
        }
        if(n / 1000 != 0){
        	reString = numMap.get(n / 1000 * 1000)+ reString;
        }
        return reString;
    }
}
