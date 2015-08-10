package leetCode.wyg.oj;

import java.util.Arrays;

public class No4_MedianOf2SortedArrays {
	public static void main(String[] args) {
		int [] a = {1,5,7,23,33,45};
		int [] b = {2,4,6,19};
		
//		int res = findKth(a, a.length, b, b.length, 10);
//		System.out.println(res);
	}
	private  int findKth(int[] A, int m, int[] B, int n, int K){
		if(m > n)
			return findKth(B, n, A, m, K);
		if(m == 0)
			return B[K-1];
		if (K==1)
			return Math.min(A[0], B[0]);
		
		int pA = Math.min(K/2,m), pB = K-pA;
		if(A[pA-1] < B[pB-1])
			return findKth(Arrays.copyOfRange(A, pA, A.length),Arrays.copyOfRange(A, pA, A.length).length,B,n,K-pA);
		else if(A[pA-1] > B[pB-1])
			return findKth(A,m,Arrays.copyOfRange(B, pB, B.length),Arrays.copyOfRange(B, pB, B.length).length,K-pB);
			else
				return A[pA-1];
	}
	
	private double findMedianSortedArrays(int[] A, int m, int[] B, int n){
		if((m+n)%2==0)
			return findKth(A, m, B, n, (m+n) / 2 + 1);
		else
			return (findKth(A, m, B, n, (m+n) / 2) + findKth(A, m, B, n, (m+n) / 2 + 1)) / 2.0;
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 == 0){
        	return len2%2==0 ? (nums2[len2/2]+nums2[len2/2-1])/2:nums2[len2/2];
        }
        if(len2 == 0){
        	return len1%2==0 ? (nums1[len1/2]+nums1[len1/2-1])/2:nums1[len1/2];
        }
        
        return findMedianSortedArrays(nums1, len1, nums2, len2);
    }
}
