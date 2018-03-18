package dynamicProgramming;

public class uniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(30,30));
	}
	public static int uniquePaths1(int m, int n) {//递归写法，计算时间过长，不推荐
        if(m <= 1 || n <= 1) return 1;
        int res1 = uniquePaths(m, n - 1);
        int res2 = uniquePaths(m - 1, n);
        return res1 + res2;
    }
	public static int uniquePaths(int m, int n) {//动态规划写法
		
        if(m <= 1 || n <= 1) return 1;
        int res[][] = new int [m][n];
		for(int i = 0; i < n; i++){
			res[0][i] = 1;
		}
		for(int i = 0; i < m; i++){
			res[i][0] = 1;
		}
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				res[i][j] = res[i - 1][j] + res[i][j - 1];
			}
		}
		return res[m - 1][n - 1];
    }
	public static int uniquePaths2(int m, int n) {//排列组合思想,C++可以，但Java会出错
	    long x = m+n-2;  //不用long会溢出，阶乘求出来太大了
	    long y = Math.min(m,n)-1;
	    long up = 1,down =1;   //最后求组合数的分子/分母
	    if(m==1||n==1) return 1;
	    for(int i = 0;i<y ;i++){
	        up *= x--;
	    }
	    for(int i = (int)y;i>0 ;i--){
	        down *= i;
	    }
	    return (int) (up/down);
	}
   
}
