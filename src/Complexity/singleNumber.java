package Complexity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * https://leetcode.com/problems/single-number/description/
 * @author triple
 *
 */

public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,2,1 };
		System.out.println(singleNumber1(A));
	}
	public static int singleNumber1(int[] A) {
		int res=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< A.length; i++){
        	map.put(A[i], 0);
        }
        for(int i = 0; i< A.length; i++){
        	map.put(A[i], map.get(A[i])+1);
        }
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
        	Map.Entry entry = (Map.Entry) iter.next();
        	if(((Integer)entry.getValue()).equals(1)){
        		res = (Integer)entry.getKey();
        	}
        }
        return res;
    }
}
