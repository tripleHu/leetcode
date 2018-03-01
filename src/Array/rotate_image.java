package Array;

public class rotate_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{ 5, 1, 9,11},{ 2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		rotate(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	/**
	 * һ�����ת
	 * | - - - - -  |
	 * | |          | |
	 * | |          | |
	 * | |          | |
	 * | - - - - - | 
	 * ȷ��ÿ��Ԫ����ת��ı��ʽ
	 * n = matrix.length - 1 ;
	 * matrix[i][j]Ԫ����ת90�Ⱥ��λ��Ϊmatrix[j][n-i],����ת����У�Ϊ��תǰ���У���ת����У�Ϊn��ȥ��תǰ����
	 * ���ν�����������ĸ�Ԫ�ص���ת
	 * @param matrix
	 */
	public static void rotate(int[][] matrix) {
        int n = matrix.length - 1 ;
		for(int i = 0, r = n; i < n; i++, r--){
			for(int j = i; j < r; j++){
				//ʹ����򽻻�����Ԫ�ص�ֵ
				matrix[i][j] = matrix[i][j] ^ matrix[j][n - i];
				matrix[j][n - i] = matrix[i][j] ^ matrix[j][n - i];
				matrix[i][j] = matrix[i][j] ^ matrix[j][n - i];
				//ʹ����򽻻�����Ԫ�ص�ֵ
				matrix[i][j] = matrix[i][j] ^ matrix[n - i][n - j];
				matrix[n - i][n - j] = matrix[i][j] ^ matrix[n - i][n - j];
				matrix[i][j] = matrix[i][j] ^ matrix[n - i][n - j];
				//ʹ����򽻻�����Ԫ�ص�ֵ
				matrix[i][j] = matrix[i][j] ^ matrix[n - j][i];
				matrix[n - j][i] = matrix[i][j] ^ matrix[n - j][i];
				matrix[i][j] = matrix[i][j] ^ matrix[n - j][i];
			}
		}
    }
}
