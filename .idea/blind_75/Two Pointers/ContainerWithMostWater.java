class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;
        int total = 0;
        while(left<right){
            int area = Math.min(heights[left],heights[right])*(right-left);
            total = Math.max(total,area);

            if(heights[left]<=heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return total;
    }
}
