package leetCode.wyg.oj;

import java.util.Arrays;

public class No65_ValidNumber {
	public static void main(String[] args) {
		System.out.println(isNumber(" 01 2"));
		System.out.println(isNumber("0.0.1e2356"));
		
	}
	public static boolean isNumber(String s) {
		if(s == null || s.length() == 0)
			return false;
		boolean occurE = false;
		boolean occurDot = false;
		s = s.trim();
		int len = s.length();
		char ch = s.charAt(0);
		if(ch < '0' || ch > '9'){
			if(ch == '.'){
				if(len == 1) return false;
				else
					occurDot = true;
			}else{
				return false;
			}
		}
		for(int i = 1; i < len; i++){
			ch = s.charAt(i);
			if(occurE && (ch < '0' || ch > '9')) return false;
			if(occurDot && (ch == '.')) return false;
			if(ch == '.'){
				occurDot = true;
			}
			if(ch == 'e' || ch == 'E'){
				occurE = true;
			}
		}
		return true;
    }
}
