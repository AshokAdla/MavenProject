package week4.day1;
import java.util.*;
public class uniqueCharsInString {
	public static void main(String[] args) {
	
		String companyName = "google";
        Set<Character> uniqueCharacters = new LinkedHashSet<Character>();
         
        // Get unique characters in the string
        for(char ch: companyName.toCharArray()) {
            uniqueCharacters.add(ch);
        }
         
        // Print the unique characters
        for(char ch: uniqueCharacters) {
            System.out.print(ch);
        }
		
	}

}
