package Array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,2};
		new Solution().nextPermutation(a);

	}

}
class Solution {
    public void nextPermutation(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i --){
            boolean needSort = true;
            for(int j = i; j < nums.length; j ++){
                if(nums[i] < nums[j]){
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                    needSort = false;
                }
            }
            if(needSort) Arrays.sort(nums, i, nums.length);
            else break;
        }
    }
}