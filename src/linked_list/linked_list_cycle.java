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
	//快慢指针能相遇说明有环！如两个人跑圈
	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			//快指针在前，每次前进两步,因为是离散的，所以快指针速度必须比慢指针大1，如（2，1）或（3，2）
			fast = fast.next.next;
			//慢指针在后，每次前进一步（由于快指针已经判断过，无需再判断slow.next != null）
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