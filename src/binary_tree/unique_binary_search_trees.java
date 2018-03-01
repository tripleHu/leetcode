package binary_tree;

public class unique_binary_search_trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(4));
		int x =0;
		int y = 4;
		 x = x ^ y;
		 y = x ^ y;
		 System.out.println(y);
		 x = x ^ y;
		 System.out.println(x);
	}
	public static int numTrees(int n) {
		int sum = 0;
        if(n == 0 ||n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        for(int i = 1; i <= n ; i++){
            sum += numTrees(i-1) * numTrees(n-i);
        }
        return sum;
    }
}
