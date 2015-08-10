package leetCode.wyg.oj;

import java.util.HashMap;

public class No13_RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMLXXXIX"));
	}
	public static int romanToInt(String s) {
		if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        
        int len = s.length();
        int ret = dict.get(s.charAt(len-1));
        //boolean isPlus = true;
        for(int i = len-2; i >= 0; i--){
        	if(dict.get(s.charAt(i)) >= dict.get(s.charAt(i+1))){
        		ret = ret + dict.get(s.charAt(i));
        	}else{
        		ret = ret - dict.get(s.charAt(i));
        	}
        }
        return ret;
    }
}
