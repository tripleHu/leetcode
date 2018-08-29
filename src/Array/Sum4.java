package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 18. 4Sum
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 * @author triple
 *
 */
public class Sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {-474,-445,-442,-426,-410,-382,-369,-367,-356,-351,-339,-335,-335,-320,-318,-313,-276,-250,-227,-215,-209,-209,-200,-198,-189,-183,-154,-149,-138,-134,-121,-110,-97,-93,-86,-66,-61,-54,-33,-12,-9,2,6,13,30,59,82,86,88,111,132,159,162,193,204,220,225,229,231,275,314,327,332,386,400,440,452,457,485};
		int tar = 3456;


		List<List<Integer>> aList = fourSum(a,tar);
		System.out.println(aList);
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0, target);
        return list;
    }
    private static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start, int remain){
        if(temp.size() > 4) return;
        else if(temp.size() == 4 && remain == 0) list.add(new ArrayList<>(temp));
        else{
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtrack(list, temp, nums, i + 1, remain - nums[i]);
                temp.remove(temp.size() - 1);
            }
        }
        
    }
}
