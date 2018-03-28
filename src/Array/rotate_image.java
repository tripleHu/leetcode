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
	 * 一层层旋转
	 * | - - - - -  |
	 * | |          | |
	 * | |          | |
	 * | |          | |
	 * | - - - - - | 
	 * 确定每个元素旋转后的表达式
	 * n = matrix.length - 1 ;
	 * matrix[i][j]元素旋转90度后的位置为matrix[j][n-i],即旋转后的行，为旋转前的列，旋转后的列，为n减去旋转前的行
	 * 三次交换可以完成四个元素的旋转
	 * @param matrix
	 */
	public static void rotate(int[][] matrix) {
        int n = matrix.length - 1 ;
		for(int i = 0, r = n; i < n; i++, r--){
			for(int j = i; j < r; j++){
				//使用异或交换两个元素的值
				matrix[i][j] = matrix[i][j] ^ matrix[j][n - i];
				matrix[j][n - i] = matrix[i][j] ^ matrix[j][n - i];
				matrix[i][j] = matrix[i][j] ^ matrix[j][n - i];
				//使用异或交换两个元素的值
				matrix[i][j] = matrix[i][j] ^ matrix[n - i][n - j];
				matrix[n - i][n - j] = matrix[i][j] ^ matrix[n - i][n - j];
				matrix[i][j] = matrix[i][j] ^ matrix[n - i][n - j];
				//使用异或交换两个元素的值
				matrix[i][j] = matrix[i][j] ^ matrix[n - j][i];
				matrix[n - j][i] = matrix[i][j] ^ matrix[n - j][i];
				matrix[i][j] = matrix[i][j] ^ matrix[n - j][i];
			}
		}
    }
}
