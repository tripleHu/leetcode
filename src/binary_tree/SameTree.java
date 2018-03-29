package binary_tree;


public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = new TreeNode(5);
		TreeNode q = new TreeNode(5);
		System.out.println(isSameTree(p, q));
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null){//两个都不为空
            if(p.val != q.val) return false;//判断值是否相等
            if(!isSameTree(p.left, q.left) || !isSameTree(p.right, q.right)) return false;//判断子节点是否相等
            return true;
        }
        else if(p == null && q == null){//两个都为空也相等
            return true;
        }
        else{//其它情况不相等
            return false;
        }
    }
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
