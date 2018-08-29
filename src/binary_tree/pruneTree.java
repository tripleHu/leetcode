package binary_tree;


/**
 * 814. Binary Tree Pruning
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 *Example 1:
Input: [1,null,0,0,1]
Output: [1,null,0,null,1]
 
Explanation: 
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
 */
public class pruneTree {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(0);
		TreeNode node3 = new TreeNode(0);
		TreeNode node4 = new TreeNode(1);
		node1.right = node2;
		node2.left = node3;
		node2.right = node4;
		pruneTree(node1);
	}
	public static TreeNode pruneTree(TreeNode root) {
        root = ZeroTree(root);
        return root;
    }
    public static TreeNode ZeroTree(TreeNode root){
        if(root == null || root.val != 0) return root;
        if(root.val == 0){
            if(ZeroTree(root.left) == null && ZeroTree(root.right) == null) {
            	root.left = null;
            	root.right =null;
            	return null;
            }
        }
        return root;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}