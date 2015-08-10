package leetCode.wyg.oj;

public class No97_InterleavingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabaac";
		String s2 = "aadaaeaaf";
		String s3 = "aadaaeaabaafaac";
		System.out.println(isInterleave(s1,s2,s3));
	}
	public static boolean isInterleave(String s1, String s2, String s3) {
		if(s1.length()+s2.length() != s3.length())
			return false;
		if((s1 == null && s2.equals(s3) 
			|| ((s2 == null || s2.length() == 0) && s1.equals(s3))
			|| ((s1 == null || s1.length() == 0) && s2.equals(s3))
			||s1 == null && s2 == null && s3 == null))
				return true;
		boolean isTrue[][] = new boolean[s2.length()+1][s1.length()+1];
		isTrue[0][0] = true;
		
		for(int i = 1; i < s1.length()+1; i++){
			isTrue[0][i] = isTrue[0][i-1] && (s3.charAt(i-1) == s1.charAt(i-1));
		}
		for(int i = 1; i < s2.length()+1; i++){
			isTrue[i][0] = isTrue[i-1][0] && (s3.charAt(i-1) == s2.charAt(i-1));
		}
		for(int row = 1; row < s2.length()+1; row++){
			for (int col = 1; col < s1.length()+1; col++){
				isTrue[row][col] = (isTrue[row-1][col] && s2.charAt(row-1)==s3.charAt(row+col-1))||(isTrue[row][col-1] && s1.charAt(col-1)==s3.charAt(row+col-1));
			}
		}
        return isTrue[s2.length()][s1.length()];
    }
}
