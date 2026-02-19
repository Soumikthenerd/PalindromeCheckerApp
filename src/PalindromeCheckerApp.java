import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Convert to character array as per hint
        char[] chars = input.toCharArray();

        // Initialize pointers at both ends
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Mismatch found, not a palindrome
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // Final Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
