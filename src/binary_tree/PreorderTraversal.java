package binary_tree;

import java.util.ArrayList;
import java.util.Stack;

import binary_tree.binary_tree_inorder_traversal.TreeNode;

public class PreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null) return a;
        Stack<TreeNode> s = new Stack<>();
        while(root != null || !s.isEmpty()){
        	while(root != null){
        		s.push(root);
                //a.add(root.val)放在这个位置是前序
                a.add(root.val);
        		root = root.left;
        	}
        	root = s.pop();
        	//a.add(root.val)放在这个位置是中序
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
