public class ValidPallindrome {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer to the next valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters in a case-insensitive manner
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Mismatch found
            }

            left++;
            right--;
        }

        return true; // All checks passed

    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(isPalindrome(s));
    }
}
