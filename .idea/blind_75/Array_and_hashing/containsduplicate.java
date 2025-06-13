publis class containsduplicate {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        for(int i =1; i < n;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
            //return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(hasDuplicate(arr));
    }
}