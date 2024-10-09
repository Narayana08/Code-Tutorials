
public class Palindrome {

    public static void main(String args[]) {

        String word = "121";
        boolean result = palindromeCheck(word);
        System.out.println("RESULT"+ result);
      
    }

    private static boolean  palindromeCheck(String word) {
        String newWord = "";
        int start = 0;
        int end = word.length() - 1;
        while (start <= end) {
            char[] wordsArray = word.toCharArray();
            newWord = newWord + wordsArray[end];
            end--;
        }
        return (word.equals(newWord));
    }
}
