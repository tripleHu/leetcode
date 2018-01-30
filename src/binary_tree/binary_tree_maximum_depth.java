package binary_tree;
public class binary_tree_maximum_depth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(5);
		System.out.println(maxDepth(root));
	}
	
	  static public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	  static public int maxDepth(TreeNode root) {
		  if(root == null){
	            return 0;
	        }
	        return ChildDepth(root);
	    }
	  static public int ChildDepth(TreeNode node){
		  int leftDepth =0;
	        int rightDepth =0;
	        if(node.left != null){
	            leftDepth = ChildDepth(node.left);
	        }
	        if(node.right != null){
	            rightDepth = ChildDepth(node.right);
	        }
	        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
	    }
	public class Solution {
	    
	}
}
