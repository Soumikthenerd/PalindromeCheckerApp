import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main (String[] args){
        String input = "racecar"; // Example input
        boolean isPalindrome = true;

        // Loop only till half of the string length as suggested by your hint
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index i with character at symmetric index from end
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break; // Stop checking if a mismatch is found
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

    }
}
