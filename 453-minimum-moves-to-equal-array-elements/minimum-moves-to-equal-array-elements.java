class Solution {
    public int minMoves(int[] nums) {
        int s=0,min=Integer.MAX_VALUE;
        for(int x:nums) {
            s+=x;
            min=Math.min(min,x);
        }
        return s-nums.length*min;
    }
}