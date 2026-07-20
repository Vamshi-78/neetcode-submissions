class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans=false;
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[j])
            ans=true;
            else{
                j++;
            }
        }
        return ans;
    }
}