package JavaChallenge;

public class stringPalindromeCheck {
	static boolean palindromecheck(String str) {
		String alphaOnly = str.replaceAll("[^a-zA-Z]+","").toLowerCase();
		//System.out.println(alphaOnly);
		String revStr="";
		int len=alphaOnly.length();
		boolean res=false;
		
		for(int i=len-1;i>=0;i--) {
			revStr+=alphaOnly.charAt(i);
		}
		//System.out.println(revStr);
		if(alphaOnly.equals(revStr)) {
			res=true;
		}else {
			res=false;
		}
				
		return res;
	}
	public static void main(String[] args) {
		String s1="A man, a plan, a canal: Panama";
		System.out.println(palindromecheck(s1));
		
		String s2 = "race a car";
		System.out.println(palindromecheck(s2));
		
		String s3 = " ";
		System.out.println(palindromecheck(s3));
	}
}
