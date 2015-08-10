package leetCode.wyg.oj;

import java.util.Arrays;

public class No3_LongestSubstringWRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int lengthOfLongestSubstring(String str){
		int max = 0;
		int idx = -1;
		int[] locOfChar = new int[256]; //�洢ÿ���ַ����ֵ�λ��
		Arrays.fill(locOfChar, -1);
		if(str == null){
			return 0;
		}
		if(str.length() == 1){
			return 1;
		}
		for(int i = 0; i < str.length(); i++){
			if(locOfChar[str.charAt(i)] > idx){
				idx = locOfChar[str.charAt(i)]; //�����ǰ�ַ����ֹ�����ô��ǰ�Ӵ�����ʼλ��Ϊ����ַ���һ�γ��ֵ�λ��+1
			}
			if(i - idx > max){
				max = i - idx;
			}
			locOfChar[str.charAt(i)] = i;
		}
		return max;
	}
}
