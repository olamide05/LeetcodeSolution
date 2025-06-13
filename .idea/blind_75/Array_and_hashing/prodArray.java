public class prodArray {
    public int[] productExceptSelf(int[] nums) {
        //int prod = 1;
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Compute prefix products
        result[0] = 1; // No elements before the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix products and combine
        int suffixProduct = 1; // No elements after the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(productExceptSelf(nums));
    }
}
