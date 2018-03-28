
public class The_kth_largest_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 2, 8, 0 };
		int k = 2;// 第2大的数
		
		System.out.println(findK(a, 0, 3, k));
	}


	public static int findK(int[] array, int left, int right, int k) {
		int i = partition(array, left, right);
		if (i == k - 1) {
			return array[k - 1];
		} else if (i > k - 1) {
			return findK(array, left, i - 1, k);
		} else if (i < k - 1) {
			return findK(array, i + 1, right, k);
		}
		return 0;
	}

	public static int partition(int s[], int l, int r) {
		int i = l, j = r, x = s[l];
		if (l < r) {
		

			while (i < j) {
				while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
					j--;
				if (i < j)
					s[i++] = s[j];

				while (i < j && s[i] <= x) // 从左向右找第一个大于等于x的数
					i++;
				if (i < j)
					s[j--] = s[i];
			}
			s[i] = x;

		}
		return i;
	}

}
