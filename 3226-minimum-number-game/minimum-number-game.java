class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int temp;
        for(int i=1;i<nums.length;++i){
            temp = nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
            i++;
        }
        return nums;
    }
}