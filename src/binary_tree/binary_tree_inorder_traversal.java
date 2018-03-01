package binary_tree;

import java.util.ArrayList;
import java.util.Stack;

public class binary_tree_inorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null) return a;
        Stack<TreeNode> s = new Stack<>();
        while(root != null || !s.isEmpty()){
        	while(root != null){
        		s.push(root);
        		root = root.left;
        	}
        	root = s.pop();
        	a.add(root.val);
        	root = root.right;
        }
        return a;
    }
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
