package binary_tree;

import binary_tree.binary_tree_inorder_traversal.TreeNode;

public class balanced_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(isBalanced(root.left) && isBalanced(root.right)){//判断左子树和右子树是否都是一颗平衡二叉树
            if(Math.abs(ChildDepth(root.left) - ChildDepth(root.right)) <= 1){//它的左子树和右子树的深度之差(平衡因子)的绝对值不超过1
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public int ChildDepth(TreeNode node){
        if(node == null) return 0;
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
    public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
