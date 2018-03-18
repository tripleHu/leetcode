package dynamicProgramming;

public class uniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(30,30));
	}
	public static int uniquePaths1(int m, int n) {//�ݹ�д��������ʱ����������Ƽ�
        if(m <= 1 || n <= 1) return 1;
        int res1 = uniquePaths(m, n - 1);
        int res2 = uniquePaths(m - 1, n);
        return res1 + res2;
    }
	public static int uniquePaths(int m, int n) {//��̬�滮д��
		
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
	public static int uniquePaths2(int m, int n) {//�������˼��,C++���ԣ���Java�����
	    long x = m+n-2;  //����long��������׳������̫����
	    long y = Math.min(m,n)-1;
	    long up = 1,down =1;   //�����������ķ���/��ĸ
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
