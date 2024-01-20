public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Initialize pointers
        int left = 0;
        int right = str.length() - 1;

        // Loop until pointers meet
        while (left < right) {
            // Compare characters
            if (str.charAt(left) != str.charAt(right)) {
                // Characters are not equal, not a palindrome
                return false;
            }

            // Move pointers
            left++;
            right--;
        }

        // All comparisons were equal, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String palindromeExample = "radar";
        boolean result = isPalindrome(palindromeExample);

        if (result) {
            System.out.println("\"" + palindromeExample + "\" is a palindrome.");
        } else {
            System.out.println("\"" + palindromeExample + "\" is not a palindrome.");
        }
    }
}
