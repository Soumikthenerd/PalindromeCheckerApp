import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        // 1. Create a Deque to store characters as per hint
        Deque<Character> deque = new ArrayDeque<>();

        // 2. Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // 3. Flag to track palindrome result
        boolean isPalindrome = true;

        // 4. Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // removeFirst() gets the front, removeLast() gets the back
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // 5. Final Output formatted as per image
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
