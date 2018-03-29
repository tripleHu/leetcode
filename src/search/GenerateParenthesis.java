package search;

import java.util.ArrayList;
//https://leetcode.com/problems/generate-parentheses/description/
public class GenerateParenthesis {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = generateParenthesis(5);
		for (String string : arrayList) {
			System.out.println(string);
		}
	}
	public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        generateDFS(res,n, n, "");
        return res;
    }
    public static void generateDFS(ArrayList<String> res,int left, int right, String temp){
        if(left > right) return; //只允许left小于right（left和right分别表示剩余左右括号的个数），即temp中的左括号数必须大于右括号
        if(left == 0 && right == 0) res.add(temp);//left和right都等于0说明，临时变量中左右括号数相等，所以将临时变量中的值存入res中
        else{//其余的情况是，先放左括号，然后放右括号，然后递归
            if(left > 0) generateDFS(res,left - 1, right, temp + "(");
            if(right > 0) generateDFS(res,left, right - 1, temp + ")");
        }
    }
}
