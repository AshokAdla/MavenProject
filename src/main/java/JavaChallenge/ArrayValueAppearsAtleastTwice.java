package JavaChallenge;

public class ArrayValueAppearsAtleastTwice {
	public static boolean CheckArrayValueAppears(int nums[],int len) {
		int count=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
		}
		if(count>=1) {
			return true;
			
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int nums1[]= {1,2,3,1};
		int len1=nums1.length;
		System.out.println("Output of Test Case:1 "+CheckArrayValueAppears(nums1,len1));
		
		int nums2[]= {1,2,3,4};
		int len2=nums2.length;
		System.out.println("Output of Test Case:2 "+CheckArrayValueAppears(nums2,len2));
		
		int nums3[]= {1,1,1,3,3,4,3,2,4,2};
		int len3=nums3.length;
		System.out.println("Output of Test Case:3 "+CheckArrayValueAppears(nums3,len3));
	}
}
