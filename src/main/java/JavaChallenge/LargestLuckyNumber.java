package JavaChallenge;
import java.util.Arrays;
public class LargestLuckyNumber {
	public static int FindLargestLuckyNumber(int arr[],int len) {
		Arrays.sort(arr);
        int maxLucky = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.MIN_VALUE) {
                continue;
            }
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == arr[i]) {
                maxLucky = Math.max(maxLucky, arr[i]);
            }
            
            for (int j = i; j < i + count; j++) {
                arr[j] = Integer.MIN_VALUE;
            }
        }
        return maxLucky;
    }
    
	public static void main(String[] args) {
		int arr1[]= {2,2,3,4};
		int len1=arr1.length;
		System.out.println("Largest Lucky Number is: "+FindLargestLuckyNumber(arr1,len1));
		
		int arr2[]= {1,2,2,3,3,3};
		int len2=arr2.length;
		System.out.println("Largest Lucky Number is: "+FindLargestLuckyNumber(arr2,len2));
		
		int arr3[]= {2,2,2,3,3};
		int len3=arr3.length;
		System.out.println("Largest Lucky Number is: "+FindLargestLuckyNumber(arr3,len3));
	}
}
