public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // Loop through all possible pairs of numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    nums.add(i+1);  // Add the indices, not the numbers themselves
                    nums.add(j+1);
                    break;  // We found a pair, no need to continue the inner loop
                }
            }
            if (!nums.isEmpty()) {
                break;  // Exit the outer loop as well once we find the pair
            }
        }

        // Convert ArrayList to int[] manually
        int[] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }

        return result;  // Return the int[] result
    }
}
