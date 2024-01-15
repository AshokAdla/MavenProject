package week3.day1;

public class CountOfCharsInString {
	public static void main(String[] args) {
		String s="Testleaf";
		char arr[]=s.toCharArray();
		int len=arr.length;
		int count=0;
		char tofind='e';
		for(int i=0;i<len;i++) {
			if(arr[i]==tofind) {
				count++;
			}
		}
		System.out.println("Character: "+tofind+" repeated "+count+" times");
		
		String str="This is the count of 2500";
		String out=str.replaceAll("[^0-9]", "");
		System.out.println(out+500);
		int val=Integer.parseInt(out);
		System.out.println(val+500);
		
		String res=str.substring(3,7);
		System.out.println(res);
		
		String words="This is cool";
		String strarr[]=words.split(" ");
		System.out.println(strarr.length);
	}

}
