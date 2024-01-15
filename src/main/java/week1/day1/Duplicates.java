package week1.day1;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,13,14,15,12,15};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
