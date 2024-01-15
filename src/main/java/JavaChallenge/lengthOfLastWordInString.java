package JavaChallenge;

public class lengthOfLastWordInString {
	public static void findLengthOfLastWord(String str) {
		String splitted[]=str.trim().split(" ");
		int len=splitted.length;
		System.out.println("The last word is "+splitted[len-1]+" with length "+splitted[len-1].length());
	}
	public static void main(String[] args) {
		String str1="Hello World";
		findLengthOfLastWord(str1);
		
		String str2="   fly me   to   the moon  ";
		findLengthOfLastWord(str2);
		
		String str3="luffy is still joyboy";
		findLengthOfLastWord(str3);
	}

}
