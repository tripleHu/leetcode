package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class populating_next_right_pointers_in_each_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode t = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		TreeLinkNode t3 = new TreeLinkNode(3);
		t.left = t2;
		t.right = t3;
		connect(t);
	}
	//ʹ�ò���������ڸ��ڵ��ѹ��NULL�ڵ��ʾһ����������Ժ�ÿ���ʵ�NULL�ڵ�ʱ��˵����ǰ���Ѿ��������
	public static void connect(TreeLinkNode root) {
		if(root==null)return;  
        Queue<TreeLinkNode> q=new LinkedList<TreeLinkNode>();  
        q.add(root);  
        q.add(null);  
        while(!q.isEmpty()){  
        	TreeLinkNode temp =  q.poll();  
        	
            if(temp != null){
            	if(temp.left!=null)q.add(temp.left);  
                if(temp.right!=null)q.add(temp.right);  
            }
            else{
            	if(!q.isEmpty())q.add(null);  
            }
            if(temp != null && q.peek() != null){
        		temp.next = q.peek();
        	}
            
        }  
    }
}
/**
 * Definition for binary tree with next pointer.*/
class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }


