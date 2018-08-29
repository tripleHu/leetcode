package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

	Note: The solution set must not contain duplicate subsets.
 * Input: [1,2,2]
	Output:
	[
	  [2],
	  [1],
	  [1,2,2],
	  [2,2],
	  [1,2],
	  []
	]
 */
	public static void main(String[] args) {
		int [] a = {1,2,2};
		subsetsWithDup(a);

	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
     public static void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        res.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) 
            	continue; // skip duplicates
            temp.add(nums[i]);
            backTrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
        
    }
}
