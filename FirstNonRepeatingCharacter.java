import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingChar(String str) {
        // Step 1: Create a LinkedHashMap to store character frequencies
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Step 2: Traverse the string and update character frequencies
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 3: Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a special value
        return '_';  // You can return any special character to indicate no result
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstNonRepeatingChar(input);
        
        if (result != '_') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
