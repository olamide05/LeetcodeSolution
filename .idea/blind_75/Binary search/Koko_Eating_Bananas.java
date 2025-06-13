class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;
        int left = 1;
        while(right>= left){
            int k = left + (right - left) / 2;
            int temp = 0;
            for(int i = 0;i<piles.length;i++){
                temp += Math.ceil((double)piles[i]/k);
            }
            if (temp <= h) {
                res = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return res;

    }
}
