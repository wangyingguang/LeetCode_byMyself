package leetCode.wyg.oj;

public class No11_ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxArea(int[] height) {
        if(height == null || height.length <= 1) return 0;
        int left = 0;
        int right = height.length-1;
        int curWater = 0;
        int maxWater = 0;
        while(left<right){
        	curWater = Math.min(height[left], height[right])*(right-left);
        	if(height[left]<height[right]){
        		left++;
        	}else{
        		right--;
        	}
        	maxWater = Math.max(curWater, maxWater);
        }
		return maxWater;
    }
}
