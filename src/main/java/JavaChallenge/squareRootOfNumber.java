package JavaChallenge;

public class squareRootOfNumber {
	static int sqrtofnumbercheck(int num) {
		if(num<2)
			return num;
		
		int left=1,right=num;
		int mid;
		long res;
		
		while(left<=right) {
			mid=left+(right-left)/2;
			res=(long)mid*mid;
			
			if(res>num)
				right=mid-1;
			else if(res<num)
				left=mid+1;
			else
				return mid;
		}
		return right;
	}
	
	public static void main(String[] args) {
		int num1=62;
		System.out.println(sqrtofnumbercheck(num1));
		
		int num2=8;
		System.out.println(sqrtofnumbercheck(num2));
	}

}
