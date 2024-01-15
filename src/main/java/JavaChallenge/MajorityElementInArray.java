package JavaChallenge;

public class MajorityElementInArray {
	static int MajorityElement(int nums[],int len) {
		int count=0;
		int majorityele=nums[0];
		for(int i=0;i<len-1;i++) {
			if(nums[i]==nums[i+1]) {
				count++;
				
				if(count>len/2) {
					majorityele=nums[i];
				}
			}
		}
		return majorityele;
	}
	public static void main(String[] args) {
		int nums1[]= {3,2,3};
		int len1=nums1.length;
		int res=0;
		res=MajorityElement(nums1,len1);
		System.out.println("Majority of element is: "+res);
		
		int nums2[]= {2,2,1,1,1,2,2};
		int len2=nums2.length;
		res=MajorityElement(nums2,len2);
		System.out.println("Majority of element is: "+res);
	}

}
