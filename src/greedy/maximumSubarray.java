package greedy;

public class maximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(A));
	}
	public static int maxSubArray(int[] A) {
        int sum = A[0];
        int max = A[0];
        for(int i = 0; i < A.length -1; i++){
        	if(sum + A[i + 1] < A[i + 1]){
        		sum = A[i + 1];
        		max = Math.max(max, sum);
        	}else {
				sum += A[i + 1];
				max = Math.max(max, sum);
			}
        }
        return max;
    }
}
