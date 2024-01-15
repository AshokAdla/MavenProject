package JavaChallenge;

public class TwoDistinctIndices {
	public static boolean TwoDistinctIndicesCheck(int nums[],int len,int k) {
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i!=j) {
					if(nums[i]==nums[j] && Math.abs(i-j)==k) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		int nums1[]= {1,2,3,1};
		int len1=nums1.length;
		int k1=3;
		System.out.println(TwoDistinctIndicesCheck(nums1,len1,k1));
		
		int nums2[]= {1,0,1,1};
		int len2=nums2.length;
		int k2=1;
		System.out.println(TwoDistinctIndicesCheck(nums2,len2,k2));
		
		int nums3[]= {1,2,3,1,2,3};
		int len3=nums3.length;
		int k3=2;
		System.out.println(TwoDistinctIndicesCheck(nums3,len3,k3));
	}

}
