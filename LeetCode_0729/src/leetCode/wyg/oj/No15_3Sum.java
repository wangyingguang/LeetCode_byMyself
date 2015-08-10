package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_3Sum {
	List<List<Integer>> ret = new ArrayList<List<Integer>>();
	public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return null;
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len-2; i++){
        	if(i>0 && nums[i] == nums[i-1]) continue;
        	else{
        		find(nums, i+1, len-1, nums[i]);
        	}
        }
        return ret;
    }

	private void find(int[] nums, int start, int end, int target) {
		// TODO Auto-generated method stub
		int left = start;
		int right = end;
		while(left<right){
			
			if(nums[left]+nums[right]+target == 0){
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(nums[start-1]);
				ans.add(nums[left]);
				ans.add(nums[right]);
				ret.add(ans);
				while(left < right && nums[left] == nums[left+1]) left++;
				while(left < right && nums[right] == nums[right-1]) right--;
				left++;
				right--;
			}else if(nums[left]+nums[right]+target < 0){
				left++;
			}else{
				right--;
			}
		}
	}
}
