class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]==nums[i+1])
            ans=true;
        }
        return ans;
    }
}