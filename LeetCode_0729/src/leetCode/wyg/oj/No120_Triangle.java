package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class No120_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> t = new ArrayList<List<Integer>>(4);
		//new ArrayList<E>(initialCapacity)
		//System.out.println();
		int [] one = {1};
		int [] two = {2,10,3};
		int [] three = {8,1,2};
		t.add(Arrays.asList(1));
		t.add(Arrays.asList(2,10));
		t.add(Arrays.asList(8,1,2));
		
		System.out.println(minimumTotal(t));
//		t.get(1).add(3);
//		t.get(1).add(4);
//		t.get(2).add(5);
//		t.get(2).add(7);
//		t.get(2).add(9);
		//t.get(0).add(2);
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
		if(triangle == null || triangle.size() == 0)
			return 0;
		
		int len = triangle.size();
		int [][] minArray = new int[len][];
		minArray[0] = new int[]{triangle.get(0).get(0)};
		List<Integer> curList;
		for(int i = 1; i < len; i++){
			minArray[i] = new int[i+1];
			curList = triangle.get(i);
			for(int j = 0; j < minArray[i].length; j++){
				if(j == 0){
					minArray[i][j] = minArray[i-1][j] + curList.get(j);
				}else if(j == minArray[i].length-1){
					minArray[i][j] = minArray[i-1][j-1] + curList.get(j);
				}else{
					minArray[i][j] = Math.min(minArray[i-1][j-1], minArray[i-1][j])+curList.get(j);
				}
				}
			}
		int min = minArray[len-1][0];
		for(int i = 1 ; i < len; i++){
			if(min > minArray[len-1][i]){
				min = minArray[len-1][i];
			}
		}
		return min;
		}
	
//		List<List<Integer>> minList = new ArrayList<List<Integer>>(len);
//		//minList.get(0).add(triangle.get(0).get(0));
//		minList.add(Arrays.asList(triangle.get(0).get(0)));
//		int curLen;
//		List curMinList = new ArrayList<Integer>(), preMinList;
//		List curTriList, preTriList;
//		int res;
//		for(int i = 1; i < len; i++){
//			
//			//curMinList = minList.get(i);
//			preMinList = minList.get(i-1);
//			curTriList = triangle.get(i);
//			preTriList = triangle.get(i-1);
//			curLen = curTriList.size();
//			for(int loc = 0; loc < curLen; loc++){
//				curMinList = new ArrayList<Integer>();
//				if(loc == 0 || loc == curLen-1){
////					int pre;
////					if(loc == 0){
////						pre = (int) preMinList.get(0);
////					}else{
////						pre = (int) preMinList.get(preMinList.size()-1);
////					}
//					curMinList.add((int)preMinList.get(loc==0?0:(loc-1))+(int)curTriList.get(loc));
//				}else{
//					curMinList.add(Integer.min((int)preMinList.get(loc-1),(int)preMinList.get(loc))+(int)curTriList.get(loc));
//				}
//				minList.add(curMinList);
//			}
//		}
//		
//		return minList.get(minList.size()-1).get(minList.get(minList.size()-1).size()-1);   
//    }
}
