package JavaChallenge;
import java.util.Scanner;

public class HappyNumberCheck {
	public static int HappyNumber(int num) {
		int sum=0, rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases to validate:");
		int T=sc.nextInt();
		for(int i=1;i<=T;i++) {
			System.out.println("******************************************");
			System.out.println("Enter the number to check Happy Number:");
			int num=sc.nextInt();
			int result=num;
			
			while(result!=1 && result!=4) {
				result=HappyNumber(result);
			}
			if(result==1) {
				System.out.println(num+" is Happy number");
			}else {
				System.out.println(num+" is not Happy number");
			}
		}
		
	}
}
