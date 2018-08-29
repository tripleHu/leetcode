package dynamicProgramming;

public class UniquePathsWithObstacles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{0}};
		System.out.println(uniquePathsWithObstacles(a));
	}
	public static int uniquePathsWithObstacles(int[][] res) {
        int m = res.length;
        int n = res[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
                if(res[i][j] == 1) res[i][j] = 0;
			    else res[i][j] = 1;
		    }
		}
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
                if(res[i][j] == 0) continue;
                if(i == 0 && j == 0) res[0][0] = 1;
                else if(i != 0 && j == 0) res[i][0] = res[i-1][0] ;
                else if(i == 0 && j != 0) res[0][j] = res[0][j-1] ;
                else{
                    res[i][j] = (res[i][j-1] + res[i-1][j]);
                }
			}
		}
		return res[m - 1][n - 1];
    }
}
