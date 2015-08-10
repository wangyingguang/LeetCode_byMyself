package leetCode.wyg.oj;

public class No152_MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];
        
        for(int i = 1; i < nums.length; i++){
        	int tmp = curMin*nums[i];
        	curMin = Math.min(nums[i], Math.min(tmp, curMax*nums[i]));
        	curMax = Math.max(nums[i], Math.max(tmp, curMax*nums[i]));
        	ans = Math.max(curMax, ans);
        }
		return ans;
    }
}
