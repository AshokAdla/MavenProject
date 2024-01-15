package JavaChallenge;

public class FirstLetterToAppearTwice {
	public static char FirstLetterAppearTwice(String s) {
		char carr[]=s.toCharArray();
		int cnt[]=new int[26];
		for(char ch:carr) {
			int index=ch-'a';
			cnt[index]+=1;
			
			if(cnt[index]==2) {
				return ch;
			}
		}
		return '\0';
	}
	
	public static void main(String[] args) {
		String s1="abccbaacz";
		System.out.println(FirstLetterAppearTwice(s1));
		
		String s2="abcdd";
		System.out.println(FirstLetterAppearTwice(s2));
	}
}
