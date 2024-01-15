package week3.day2;

import java.util.Scanner;

public class MaximalSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int t=1;t<=T;t++) {
			String str=sc.nextLine();
			String[] arr=str.split(" ");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			//System.out.println("Length of last word is: "+arr[arr.length-1]);
		}
		
		
//		String s="Hello world";
//		int max_length = 0; 
//		String max_substr = "";  
//		for (int i=0; i < s.length(); i++){
//			for (int j=i+1; j <= s.length(); j++){
//				String substr = s.substring(i, j);     
//				if(substr.length() > max_length){      
//					max_length = substr.length();      
//					max_substr = substr;     
//					}  
//				} 
//			}  
//		System.out.println("The maximum substring is: "+ max_substr + " and its length is "+ max_length); 
	}

}
