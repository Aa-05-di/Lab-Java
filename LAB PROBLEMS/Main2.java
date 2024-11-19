public class Main2 {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }
        return true;  // It is a palindrome
    }

    // Function to replace palindromic substrings with '*'
    public static String replacePalindromes(String str) {
        // Create a StringBuilder to efficiently modify the string
        StringBuilder result = new StringBuilder(str);
        
        // Check all possible substrings
        boolean[] replaced = new boolean[str.length()]; // To track replaced characters
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > 1) {  // Check if it's a palindrome and length > 1
                    // Mark the characters as replaced to avoid overlapping replacements
                    for (int k = i; k < j; k++) {
                        replaced[k] = true;
                    }
                }
            }
        }

        // Rebuild the string with '*' for replaced characters
        for (int i = 0; i < str.length(); i++) {
            if (replaced[i]) {
                result.setCharAt(i, '*');
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "malayalamanorama";  // Example input string
        
        // Replace all palindromic substrings with '*'
        String updatedString = replacePalindromes(input);
        
        // Output the updated string
        System.out.println("Updated string: " + updatedString);
    }
}
