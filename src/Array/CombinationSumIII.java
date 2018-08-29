package Array;

import java.util.*;

public class CombinationSumIII {
/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

	说明：
	
	所有数字都是正整数。
	解集不能包含重复的组合。 
	输入: k = 3, n = 7
	输出: [[1,2,4]]
	输入: k = 3, n = 9
	输出: [[1,2,6], [1,3,5], [2,3,4]]

 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, k, n);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int start, int k, int remain) {
        if(tempList.size() > k) {
            return;
        } else if (tempList.size() == k && remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for(int i=start; i <= 9; i++) {
                tempList.add(i);
                backtrack(result, tempList, i+1, k, remain - i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
