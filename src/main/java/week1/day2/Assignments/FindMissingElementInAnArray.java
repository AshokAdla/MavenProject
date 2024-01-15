package week1.day2.Assignments;

import java.util.Arrays;

public class FindMissingElementInAnArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		int n=arr.length;
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			sum=sum-arr[i];
		}
		System.out.println("Missing element is: "+sum);
	}
}
