package leetCode.wyg.oj;

public class No147_InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode idx = head;
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode tmp,tmp0;
        while(idx != null){
        	if(idx.val > idx.next.val){
        		tmp = idx.next;
        		idx.next = tmp.next;
        		while(first != idx){
        			tmp0 = first.next;
        			if(tmp.val <= tmp0.val){
        				tmp.next = tmp0;
        				first.next = tmp;
        			}
        			first = first.next;
        		}
        		idx = idx.next;
        		first = head;
        	}
        }
        return head;
    }
	
}




