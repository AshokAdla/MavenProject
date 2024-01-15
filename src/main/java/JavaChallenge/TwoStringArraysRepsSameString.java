package JavaChallenge;

public class TwoStringArraysRepsSameString {
	public static String ComputeWord(String word[]) {
		int len=word.length;
		String res[]=new String[len];
		String output="";
		
		for(int i=0;i<len;i++) {
			res[i]+=word[i];
		}
		
		for(int i=0;i<res.length;i++) {
			output+=res[i];
		}
		return output;
	}
	public static boolean FindTwoStringArraysRepsSameString(String firstword[],String secondword[]) {
		String resultfirstword=ComputeWord(firstword);
		System.out.println("1st Word: "+resultfirstword);
		String resultsecondword=ComputeWord(secondword);
		System.out.println("2nd Word: "+resultsecondword);
		
		if(resultfirstword.equals(resultsecondword)) {
			return true;
		}else {
			return false;
		}		
	}
	public static void main(String[] args) {
		String word1[]= {"ab","c"};
		String word2[]= {"a","bc"};
		System.out.println("---Output: "+FindTwoStringArraysRepsSameString(word1,word2));
		System.out.println("#########################");
		
		String word3[]= {"a","cb"};
		String word4[]= {"ab","c"};
		System.out.println("---Output: "+FindTwoStringArraysRepsSameString(word3,word4));
		System.out.println("#########################");
		
		String word5[]= {"abc","d","defg"};
		String word6[]= {"abcddefg"};
		System.out.println("---Output: "+FindTwoStringArraysRepsSameString(word5,word6));
		System.out.println("#########################");
	}
}
