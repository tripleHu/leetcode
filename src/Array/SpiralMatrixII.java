package Array;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMatrix(3);
	}

	public static int[][] generateMatrix(int n) {
		int matrix[][] = new int[n][n];
		int count = 1;
		int row_start = 0, row_end = n - 1, col_start = 0, col_end = n - 1;

		while (count <= n * n) { // 四个for循环相当于转了一圈
			for (int i = col_start; i <= col_end; i++)// 从左到右横着一行
				matrix[row_start][i] = count++;
			row_start++;
			for (int i = row_start; i <= row_end; i++)// 从上到下竖着一列
				matrix[i][col_end] = count++;
			col_end--;

			for (int i = col_end; i >= col_start; i--)// 从右到左横着一行
				matrix[row_end][i] = count++;
			row_end--;

			for (int i = row_end; i >= row_start; i--)// 从下到上竖着一列    
				matrix[i][col_start] = count++;
			col_start++;
		}
		return matrix;
	}
}
