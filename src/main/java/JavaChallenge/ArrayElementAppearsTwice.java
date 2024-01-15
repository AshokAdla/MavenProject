package JavaChallenge;

public class ArrayElementAppearsTwice {
	public static int ElementAppearsTwice(int nums[]) {
		int res=nums[0];
		for(int i=1;i<nums.length;i++) {
			res=res^nums[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int nums1[]= {2,2,1};
		System.out.println(ElementAppearsTwice(nums1));
		
		int nums2[]= {4,1,2,1,2};
		System.out.println(ElementAppearsTwice(nums2));
		
		int nums3[]= {1};
		System.out.println(ElementAppearsTwice(nums3));
	}

}
