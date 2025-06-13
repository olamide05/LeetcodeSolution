public class EncodeAndDecode {
    private List<Integer> nums = new ArrayList<>();
    public String encode(List<String> strs) {
        //use arraylist
        //  ArrayList<Integer> nums = new ArrayList<>();
        StringBuilder encodedString = new StringBuilder();

        while (!strs.isEmpty()) {
            for (int i = 0; i < strs.size(); i++) {
                String current = strs.get(i);
                encodedString.append(current);   // Concatenate string
                nums.add(current.length());     // Add string length to nums
            }
            strs.clear(); // To exit the loop, clear the list
        }

        return encodedString.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>(); // List to store decoded strings
        int index = 0;

        for (int length : nums) {
            String substring = str.substring(index, index + length); // Extract substring
            result.add(substring); // Add substring to the result list
            index += length; // Move the starting index forward
        }

        return result; // Return the list of decoded strings

    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String encoded = encode(strs);
        System.out.println("encoded: " + encoded);
        String[] decoded = decode(encoded);
        System.out.println("decoded: " + Arrays.toString(decoded));
    }
}
