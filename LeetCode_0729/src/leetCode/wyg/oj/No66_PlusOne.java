package leetCode.wyg.oj;

import java.util.Arrays;

public class No66_PlusOne {
	public static void main(String[] args) {
		int [] a = {9};
		System.out.println(Arrays.toString(plusOne(a)));
	}
	
	public static int[] plusOne(int[] digits){
		if(digits == null || digits.length == 0){
        	return null;
        }
		int carry = 1;
		int idx = digits.length-1;
		while(carry == 1){
			digits[idx] += 1;
			if(digits[idx] >= 10){
				digits[idx] %= 10; 
				idx--;
				if(idx == -1){
					int [] tmp = new int[digits.length+1];
					tmp[0] = 1;
					for(int i = 0 ; i < digits.length; i++){
						tmp[i+1] = digits[i];
					}
					digits = tmp;
					break;
				}
				continue;
			}
			
			carry = 0;
		}
		return digits;
	}
	
//	public static int[] plusOne(int[] digits) {
//        if(digits == null || digits.length == 0){
//        	return null;
//        }
//        int len = digits.length;
//        long nums = 0;
//        for(int i = 0; i < len; i++){
//        	nums = nums*10 + digits[i]; 
//        }
//        nums++;
//        long tmp = nums;
//        int nL = 0;
//        while(tmp != 0){
//        	nL++;
//        	tmp /= 10;
//        }
//        int [] res = new int[nL];
//        int idx = nL-1;
//        while(nums != 0){
//        	res[idx] = (int) (nums%10);
//        	nums /= 10;
//        	idx--;
//        }
//        return res;
//    }
}
