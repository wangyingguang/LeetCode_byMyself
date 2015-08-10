package leetCode.wyg.oj;

public class No7_ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int reverse(int x) {
        if(x<0)
        	return -reverse(-x);
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = new String(sb);
        //long lres = Long.valueOf(s);
        return Integer.valueOf(s);
    }
}
