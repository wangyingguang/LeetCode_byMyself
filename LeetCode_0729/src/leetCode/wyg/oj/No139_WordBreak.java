package leetCode.wyg.oj;

import java.util.HashSet;
import java.util.Set;

public class No139_WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ws = new HashSet<String>();
		ws.add("leet");
		ws.add("code");
		System.out.println(wordBreak("leetcodeleetleetleet", ws));
	}
	
	//³¬Ê±µÝ¹é
//	public static boolean wordBreak(String s, Set<String> wordDict) {
//		if(s==null || s.length() == 0){
//			return true;
//		}
//		int len = s.length();
//		int idx = 1;
//		while(idx <= len){
//			String tmp = s.substring(0, idx);
//			if(wordDict.contains(tmp) && wordBreak(s.substring(idx), wordDict)){
//				return true;
//			}
//			idx++;
//		}
//        return false;
//    }
	
	public static boolean wordBreak(String s, Set<String> wordDict) {
		if(s==null || s.length() == 0){
			return true;
		}
		int len = s.length();
		boolean dp[] = new boolean[len+1];
		dp[0] = true;
		for(int i = 1; i <= len; i++){
			if(dp[i-1]){
				int idx = i-1;
				for(int j = idx; j < len; j++){
					String tmp = s.substring(idx, j+1);
					if(wordDict.contains(tmp)){
						dp[j+1] = true;
					}
				}
			}
		}
        return dp[len];
    }
}
