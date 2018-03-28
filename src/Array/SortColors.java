package Array;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,0};
		sortColors(A);
		int a = 2, b = 2;
		 a = a ^ b;
	     b = a ^ b;
	     a = a ^ b;
	     int v = 4;
	     System.out.println(v);
	}
	public static void sortColors(int[] A) {
        int len = A.length;
        int l = 0;//l存0的个数
        int r = 0;//r存2的个数
     
        for(int i = 0; i < len - r; i++){
            if(A[i] == 0){//0交换到开始
                swap(A, i, l);
                l ++;
            }
            else if(A[i] == 2){//2交换到后面
                swap(A, i, len - 1 - r);
                r ++;
                i --;
            }
        }
    }
    public static void swap(int[] A, int a, int b){
    	 int tmp = A[a];  
         A[a] = A[b];  
         A[b] = tmp;  
    }
}
