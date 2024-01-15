package week1.day2.Assignments;

public class Palindrome {
	public static void main(String[] args) {
		int num=-34343;
		int originalnum=num;
		int rev=0, rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(originalnum==rev) {
			System.out.println(originalnum+" is palindrome");
		}else {
			System.out.println(originalnum+" is not a palindrome");
		}
	}
}
