package leetCode.wyg.oj;

import java.util.Arrays;

public class No3_LongestSubstringWRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int lengthOfLongestSubstring(String str){
		int max = 0;
		int idx = -1;
		int[] locOfChar = new int[256]; //存储每个字符出现的位置
		Arrays.fill(locOfChar, -1);
		if(str == null){
			return 0;
		}
		if(str.length() == 1){
			return 1;
		}
		for(int i = 0; i < str.length(); i++){
			if(locOfChar[str.charAt(i)] > idx){
				idx = locOfChar[str.charAt(i)]; //如果当前字符出现过，那么当前子串的起始位置为这个字符上一次出现的位置+1
			}
			if(i - idx > max){
				max = i - idx;
			}
			locOfChar[str.charAt(i)] = i;
		}
		return max;
	}
}
