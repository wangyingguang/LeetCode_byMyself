package leetCode.wyg.oj;

public class No91_DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456789";
		System.out.println(numDecodings(s));
		
	}
	public static int numDecodings(String s) {
        if(s==null || s.length()==0 || s.charAt(0) == '0'){
        	return 0;
        }
        int nums[] = new int[s.length()+1]; //nums[i]表示s 0...i-1子串decode的种类数
        nums[0] = 1;
        nums[1] = 1;
        for(int i = 2; i < s.length()+1; i++ ){
        	if(s.charAt(i-1) == '0'){
        		if(s.charAt(i-2) == '0' || s.charAt(i-2)-'0' >2){
        			return 0;
        		}
        		nums[i] = nums[i-2];
        	}else{
        		if(Integer.parseInt(s.substring(i-2,i))>10 && Integer.parseInt(s.substring(i-2,i))<= 26){
        			nums[i] = nums[i-1] + nums[i-2];
        		}else{
        			nums[i] = nums[i-1];
        		}
        	}
        }
        return nums[s.length()];
    }
}
