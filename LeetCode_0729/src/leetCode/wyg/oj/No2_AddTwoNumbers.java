package leetCode.wyg.oj;

public class No2_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
	}
	public ListNode addTwoNumbers(ListNode num1, ListNode num2){
		ListNode res = null;
		ListNode resNode =null;
		if(num1==null || num2 == null){
			resNode = (num1==null)?num2:num1;
		}else{
			int sum = num1.val + num2.val;
			int carry = sum / 10;
			sum = sum % 10;
			res = new ListNode(sum);
			resNode = res;
			while(true){
				if(num1.next == null && num2.next == null){
			        if(carry == 0)
			            return resNode;
			        else{
			            res.next = new ListNode(carry);
			            return resNode;
			        }
			    }else if(num1.next == null && num2.next != null){
					if(carry == 0){
						res.next = num2.next;
					}else{
						res.next = addTwoNumbers(new ListNode(carry), num2.next);
					}
				}else if(num2.next == null &&num1.next != null ){
					if(carry == 0){
						res.next = num1.next;
					}else{
						res.next = addTwoNumbers(new ListNode(carry), num1.next);
					}
				}else{
					sum = num1.next.val + num2.next.val + carry;
					carry = sum / 10;
					sum = sum % 10;
					res.next = new ListNode(sum);
					res = res.next;
				}
				
			}
		}
		
		return resNode;	
	}
}


