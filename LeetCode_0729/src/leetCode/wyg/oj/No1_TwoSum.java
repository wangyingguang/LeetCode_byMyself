package leetCode.wyg.oj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class No1_TwoSum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int [] res = new No1_TwoSum().twoSum(arr,9);
		System.out.println(res[0]+" "+res[1]);
	}
	
	
	
	public int[] twoSum(int [] numbers, int target){
		int [] res = new int[2];
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		if(numbers == null || numbers.length <= 1)
			return res;
		else{
			for (int i=0; i < numbers.length; i++){
				Integer n = map.get(numbers[i]);
				if(n == null){
					map.put(numbers[i], i);
				}
				n = map.get(target-numbers[i]);
				if(n != null && n < i){
					res[0] = n+1;
					res[1] = i+1;
					return res;
				}
			}
			
		}
		return res;
	}

}
