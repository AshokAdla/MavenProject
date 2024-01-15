package JavaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharsShowUpInAllStringWordsArray {
	public static List<String> FindCharsShowUpInAllStringWordsArray(String[] words) {
		List<String> lst = new ArrayList<String>();
		if (words.length == 0 || words == null) {
			return lst;
		}
		String firstword = words[0];
		for (char ch : firstword.toCharArray()) {
			boolean isPresentInAll = true;

			for (int i = 0; i < words.length; i++) {
				if (!containsChar(words[i], ch)) {
					isPresentInAll = false;
					break;
				}
			}
			if (isPresentInAll) {
				lst.add(String.valueOf(ch));

				for (int i = 0; i < words.length; i++) {
					words[i] = removeChar(words[i], ch);
				}
			}
		}
		return lst;
	}

	public static boolean containsChar(String word, char ch) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}

	public static String removeChar(String word, char ch) {
		int index = word.indexOf(ch);
		if (index != -1) {
			return word.substring(0, index) + word.substring(index + 1);
		}
		return word;
	}

	public static void main(String[] args) {
		String words1[] = { "bella", "label", "roller" };
		System.out.println("Common characters are: " + FindCharsShowUpInAllStringWordsArray(words1));

		String words2[] = { "cool", "lock", "cook" };
		System.out.println("Common characters are: " + FindCharsShowUpInAllStringWordsArray(words2));
	}
}
