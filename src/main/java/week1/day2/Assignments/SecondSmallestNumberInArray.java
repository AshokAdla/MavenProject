package week1.day2.Assignments;

import java.util.Arrays;

public class SecondSmallestNumberInArray {
	public static void main(String[] args) {
		int arr[]= {23,45,67,32,39,22};	
		int n=arr.length;
		Arrays.sort(arr);	//After sorting - 22,23,32,39,45,67
		int smallest=arr[0], secondsmallest=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]<secondsmallest) {
				smallest=arr[i];
				secondsmallest=arr[i+1];
			}
		}
		System.out.println("Smallest number is: "+smallest);
		System.out.println("Second smallest number is: "+secondsmallest);
	}

}
