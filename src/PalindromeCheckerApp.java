import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        String reverse = "";

        // Reverse logic based on your previous hint
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Determine if it's a palindrome (true or false)
        boolean isPalindrome = input.equalsIgnoreCase(reverse);

        // Print exactly as shown in the image
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
