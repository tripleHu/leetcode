package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
/**
 * 46. Permutations
 * Given a collection of distinct integers, return all possible permutations.
 * Input: [1,2,3]
	Output:
	[
	  [1,2,3],
	  [1,3,2],
	  [2,1,3],
	  [2,3,1],
	  [3,1,2],
	  [3,2,1]
	]
 */
	public static void main(String[] args) {
		int [] a = {1,2,3};
		System.out.println(permute(a));

	}
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
       
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList<>(tempList));
    	}else{
    			for(int i = 0; i < nums.length; i++){ 
    				if(tempList.contains(nums[i])) continue; // 元素存在，跳过本次循环
    				tempList.add(nums[i]);
    				backtrack(list, tempList, nums);
    				tempList.remove(tempList.size() - 1);
    			   }
    		   }
    	}
    

}
