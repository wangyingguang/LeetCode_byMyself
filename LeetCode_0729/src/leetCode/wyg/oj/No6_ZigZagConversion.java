package leetCode.wyg.oj;

public class No6_ZigZagConversion {
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println(new No6_ZigZagConversion().convert(s, 2));
}
	public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder("");
        if (numRows <= 1 || s.length() <3 || s.length() <= numRows)
        	return s;
        int zigPan = 2*numRows-2;
//        if(numRows == 2){
//        	StringBuilder sb0 = new StringBuilder("");
//        	StringBuilder sb1 = new StringBuilder("");
//        	for(int i = 0 ; i < s.length() ; i++){
//        		if(i%2==0)
//        			sb0.append(s.charAt(i));
//        		else
//        			sb1.append(s.charAt(i));
//        	}
//        	return new String(sb0.append(sb1));
//        }
        for (int i = 0; i < numRows; i++){
        	for(int j = i; j < s.length(); j+=zigPan){
        		sb.append(s.charAt(j));
        		if(i != 0 && i != numRows-1 &&  zigPan+j-2*i< s.length()){
        			sb.append(s.charAt(zigPan+j-2*i));
        		}
        	}
        }
        return new String(sb);
    }
}
