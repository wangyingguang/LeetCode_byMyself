package leetCode.wyg.oj;

public class Test {
	public static void main(String[] args) {
		int [] nums = {1,4,6,9,19};
		int [] a = {2,7,8,11,14,15,16};
		LinkedList l1 = new LinkedList(nums);
		LinkedList l2 = new LinkedList(a);
		System.out.println(merg2(l1,l2));
		
	}
	
	public static LinkedList merg(LinkedList l1, LinkedList l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode h1 = l1.getHead();
		ListNode h2 = l2.getHead();
		ListNode head = new ListNode(0);
		ListNode tmp = head;
		while(h1 != null && h2 != null){
			if(h1.val <= h2.val){
				tmp.next = h1;
				tmp = tmp.next;
				h1 = h1.next;
			}else{
				tmp.next = h2;
				tmp = tmp.next;
				h2 = h2.next;
			}
			if(h1 == null){
				tmp.next = h2;
				break;
			}
			if(h2 == null){
				tmp.next = h1;
				break;
			}
		}
		return new LinkedList(head.next);
	}
	public static LinkedList merg2(LinkedList l1, LinkedList l2){
		ListNode h1 = l1.getHead();
		ListNode h2 = l2.getHead();
		if(h1 == null) return l2;
		if(h2 == null) return l1;
		ListNode head = null;
		if(h1.val <= h2.val){
			head = h1;
			head.next = merg2(new LinkedList(h1.next),new LinkedList(h2)).getHead();
		}else{
			head = h2;
			head.next = merg2(new LinkedList(h1),new LinkedList(h2.next)).getHead();
		}
		return new LinkedList(head);
	}
}
