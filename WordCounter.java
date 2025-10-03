import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private HashMap<String, Integer> wordCounts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        wordCounts = new HashMap<>();

    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> words)
    {
        for(String word : words) {
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }
    }
    
    public void printWordCounts()
    {
        System.out.println("Word usage counts");
        for(String word: wordCounts.keySet()){
            System.out.println(word + ":" + wordCounts.get(word));
        }
    }
}
