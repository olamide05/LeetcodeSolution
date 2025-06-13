public class validAnagram {
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> count = new HashMap<>();

        // Loop through both strings
        for (int i = 0; i < s.length(); i++) {
            // Increment count for characters in s
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            // Decrement count for characters in t
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }

        // If all character counts are zero, the strings are anagrams
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s,t));


    }
}
