package JavaChallenge;
import java.util.Scanner;

public class ShuffledSentenceWithNumbers {
	public static void SplitStringToCompute(String str) {
		String[] arr = str.split(" ");
		int len = arr.length;
		String output[] = new String[len];
		output = RemoveNumbersFromSentence(str, len);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		System.out.println();
		
	}
	public static String[] RemoveNumbersFromSentence(String str, int len) {
		String res[] = new String[len];
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int wordlen = words[i].length() - 1;
			char lastelement = (char) words[i].charAt(wordlen);
			int digitValue = Character.getNumericValue(lastelement);
						
			if (digitValue == 1 || digitValue == 2 || digitValue == 3 || digitValue == 4) {
				res[digitValue-1] = words[i].replaceAll("\\d", "");
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str1 = "is2 sentence4 This1 a3";
		SplitStringToCompute(str1);
		
		String str2 = "Myself2 Me1 I4 and3";
		SplitStringToCompute(str2);	
	}
}
