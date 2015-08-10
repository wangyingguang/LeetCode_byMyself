package leetCode.wyg.oj;

public class No9_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new No9_PalindromeNumber().isPalindrome(-189981));
		System.out.println(new No9_PalindromeNumber().isPalindrome2(189981));
		System.out.println(Integer.valueOf("+100"));
	}
	public boolean isPalindrome(int x) {
		if(x < 0)
			return false;
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
        	if(str.charAt(start) == str.charAt(end)){
        		start++;
        		end--;
        	}else{
        		return false;
        	}	 
        }
        return true;
    }
	public boolean isPalindrome2(int x) {// faster than the above method
        if(x<0)
        	return false;
        int base = 1;
        int leftDigit;
        int rightDigit;
        if(x < 10)
        	return true;
        while(x/base >= 10){
        	base *= 10;
        }
        while(x != 0){
        	leftDigit = x/base;
        	rightDigit = x%10;
        	if(leftDigit != rightDigit)
        		return false;
        	x -= base * leftDigit;
        	base /= 100;
        	x = x/10;
        }
        return true;
    }
}
