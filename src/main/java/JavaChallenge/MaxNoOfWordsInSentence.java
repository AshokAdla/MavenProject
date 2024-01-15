package JavaChallenge;

public class MaxNoOfWordsInSentence {
	public static int FindMaxWordsInSentence(String sentences[]) {
		int max_length=0;
		for(String sentence:sentences) {
			String wordsineach[]=sentence.split(" ");
			if(wordsineach.length>max_length) {
				max_length=wordsineach.length;
			}
		}
		
		return max_length;
	}
	public static void main(String[] args) {
		String sentences1[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println("Maximum no.of words in sentence: "+FindMaxWordsInSentence(sentences1));
		
		String sentences2[]={"please wait", "continue to fight", "continue to win"};
		System.out.println("Maximum no.of words in sentence: "+FindMaxWordsInSentence(sentences2));
	}

}
