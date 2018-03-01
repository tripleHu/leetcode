package linked_list;

import java.util.HashSet;

public class linked_list_cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode head1 = new ListNode(2);
		ListNode head2 = new ListNode(3);
		head.next = head1;
		head1.next = head2;
		head2.next = head;
		System.out.println(hasCycle(head));
	}
	
	public static boolean hasCycle1(ListNode head) {
		ListNode cursor = head;
		if(cursor == null){
			return false;
		}
		HashSet<ListNode> set =new HashSet<ListNode>();
		while(!set.contains(cursor)){
			set.add(cursor);
			cursor = cursor.next;
			if(cursor == null){
				break;
			}
		}
		if(set.contains(cursor)){return true;}
		return false;
		
	}
	//����ָ��������˵���л�������������Ȧ
	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			//��ָ����ǰ��ÿ��ǰ������,��Ϊ����ɢ�ģ����Կ�ָ���ٶȱ������ָ���1���磨2��1����3��2��
			fast = fast.next.next;
			//��ָ���ں�ÿ��ǰ��һ�������ڿ�ָ���Ѿ��жϹ����������ж�slow.next != null��
			slow = slow.next;
			if (fast == slow)
				return true;
			}
		return false;
		
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
  }