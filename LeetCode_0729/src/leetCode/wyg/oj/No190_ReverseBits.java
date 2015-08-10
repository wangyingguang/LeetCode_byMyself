package leetCode.wyg.oj;

public class No190_ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBits(0b1));
	}
	public static int reverseBits(int n) {
        long ret = 0;
        int mask = 0x1;
        boolean isOne =false;
        for(int i = 0; i < 32; i++){
        	isOne = ((mask & n) != 0);
        	if(isOne){
        		System.out.println("the"+i+"bit is 1");
        		ret = ret + (1<<(31-i));
        	}
        	mask = (mask << 1);
        }
        return (int)(ret&0x0FFFFFFFF);
    }
}
