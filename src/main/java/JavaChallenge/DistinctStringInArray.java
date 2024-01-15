package JavaChallenge;

import java.util.Arrays;

public class DistinctStringInArray {
	public static String FindDistinctStringInArray(String arr[], int n, int k) {
		
		int count=0;
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) 
				if(i!=j && arr[i]==arr[j]) {
					break;
				}
				
				if(j==n) 
					count++;
				
				if(count==k) {
					return arr[i];
				}	
		}
		return null;
	}

	public static void main(String[] args) {
		String arr1[] = { "d", "b", "c", "b", "c", "a" };
		int n1=arr1.length;
		int k1 = 2;
		System.out.println("Distinct element is:" + FindDistinctStringInArray(arr1, n1, k1));
		
		String arr2[] = { "aaa","aa","a" };
		int n2=arr2.length;
		int k2 = 1;
		System.out.println("Distinct element is:" + FindDistinctStringInArray(arr2, n2, k2));
		
		String arr3[] = { "a","b","a" };
		int n3=arr3.length;
		int k3 = 3;
		System.out.println("Distinct element is:" + FindDistinctStringInArray(arr3, n3, k3));

	}

}
