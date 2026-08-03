class Solution {
    public int findMin(int[] nums) {
        int min=nums[nums.length-1];
        for(int n:nums){
            if(n<min)
            min=n;
        }
        return min;
    }
}
