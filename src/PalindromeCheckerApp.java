import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main (String[] args){
        String input = "racecar";
        String reverse = "";

        // Iterate from the last character to the first as per the hint
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Check if the original string matches the reversed string
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
