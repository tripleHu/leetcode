package dynamicProgramming;

import String.integer_to_roman;

public class climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(45));
	}
	public static int climbStairs(int n) {
        if(n <= 3){
            return n;
        }
        int res = 0; 
        int a = 2;
        int b = 3;
        for(int i = 4; i <= n; i++){
        	res = a + b;
        	a = b;
        	b = res;
        }
        return res;
    }
}
