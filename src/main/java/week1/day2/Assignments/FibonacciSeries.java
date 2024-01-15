package week1.day2.Assignments;

public class FibonacciSeries {
	static public void printFibonacci(int range, int firstNum, int secNum, int sum) {
		System.out.print(firstNum+",");
		System.out.print(secNum+",");
		for(int i=1;i<=range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(sum+",");
		}
	}
	public static void main(String[] args) {
		int range=8, firstNum=0, secNum=1, sum=0;
		printFibonacci(range,firstNum,secNum,sum);
	}

}
