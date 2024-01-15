package JavaChallenge;

public class SplitArrayExample {
    public static void main(String[] args) {
        String sentences[] = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        // Iterate over the array of sentences
        for (String sentence : sentences) {
            // Split each sentence into an array of words using space as the delimiter
            String[] wordsArray = sentence.split(" ");

            // Print the elements of the resulting array
            for (String word : wordsArray) {
                System.out.println(word);
            }

            // Add a separator line between sentences
            System.out.println("----------");
        }
    }
}
