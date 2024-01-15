package JavaChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfoccurencesOfValueInArray {
	public static boolean NumberOfoccurencesOfEachValueInArray(int arr[],int len) {
		int res[]=new int[len];
		for(int i=0;i<len;i++) {
			int count=0;
			for(int j=0;j<len;j++) {
				if(i!=j && arr[i]!=Integer.MIN_VALUE && arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			
			if(arr[i]!=Integer.MIN_VALUE) {
				System.out.println("Number "+ arr[i]+" is repeated "+(count+1)+" times");
				res[i]=arr[i];
			}
		}
		
		boolean ans=false;
		for(int i=0;i<res.length;i++) {
			for(int j=i;j<res.length;j++) {
				if(i!=j && res[i]==res[j]) {
					ans=true;
				}
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,2,1,1,3};
		int len1=arr1.length;
		System.out.println("-------Output is: "+NumberOfoccurencesOfEachValueInArray(arr1,len1));
		
		int arr2[]= {1,2};
		int len2=arr2.length;
		System.out.println("-------Output is: "+NumberOfoccurencesOfEachValueInArray(arr2,len2));
		
		int arr3[]= {-3,0,1,-3,1,1,1,-3,10,0};
		int len3=arr3.length;
		System.out.println("-------Output is: "+NumberOfoccurencesOfEachValueInArray(arr3,len3));
		
		
		
	}

}
