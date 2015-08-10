package leetCode.wyg.oj;

public class LinkedList {
	ListNode head;
	
	public LinkedList(){
		head = null;
	}
	public LinkedList(ListNode node){
		head = node;
	}
	public LinkedList(int[] nums){
		head = new ListNode(nums[0]);
		ListNode tmp = head;
		for(int i = 1; i < nums.length; i++){
			tmp.next = new ListNode(nums[i]);
			tmp = tmp.next;
		}
	}
	public ListNode getHead(){
		return head;
	}
	public String toString(){
		if(head == null) return "null";
		String str = "";
		ListNode tmp = head;
		while(tmp != null){
			str = str + tmp.val + "->";
			tmp = tmp.next;
		}
		return str.substring(0, str.length()-2);
	}
}
