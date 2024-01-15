package JavaChallenge;

public class FirstNonRepeatingCharIndex {
	public static int FirstNonRepeatIndex(char[] arr,int len) {
		for (int i = 0; i < len; i++) {
			boolean repeat=false;
			int count=0;
			for(int j=0;j<len;j++) {
				if(i!=j && arr[i]==arr[j]) {
					repeat=true;
					count++;
					break;
				}
			}

			if(count==0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String s1 = "leetcode";
		char arr1[] = s1.toCharArray();
		int len1 = arr1.length;
		System.out.println(FirstNonRepeatIndex(arr1,len1));
		
		String s2 = "loveleetcode";
		char arr2[] = s2.toCharArray();
		int len2 = arr2.length;
		System.out.println(FirstNonRepeatIndex(arr2,len2));
		
		String s3 = "aabb";
		char arr3[] = s3.toCharArray();
		int len3 = arr3.length;
		System.out.println(FirstNonRepeatIndex(arr3,len3));
	}
}
