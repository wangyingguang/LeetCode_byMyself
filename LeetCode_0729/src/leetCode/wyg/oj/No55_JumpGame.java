package leetCode.wyg.oj;

public class No55_JumpGame {
	public boolean canJump(int[] nums) {
		if(nums == null || nums.length == 0) return false;
		int step = nums[0];
		for(int i = 0; i < nums.length; i++){
			if(step > 0){
				step--;
				step = step>nums[i]?step:nums[i];
			}else return false;
		}
        return true;
    }
}
