package search;

public class search_insert_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,3};
		int target = 3;
		System.out.println(searchInsert(A, target));
	}
	public static int searchInsert(int[] A, int target) {
        if(A[0] > target) return 0;
        if(A[A.length - 1] == target) return A.length - 1;
        if(A[A.length - 1] < target) return A.length;
        int index = 0;
        for(int i = 0; i < A.length - 1; i++){
        	if(A[i] == target){
        		index = i;
        		break;
        	}
        	else if(A[i] < target && A[i+1] > target){
        		index = i + 1;
        		break;
        	}
        }
        return index;
    }
}
