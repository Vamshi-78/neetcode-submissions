class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zeros=0;
        for(int num:nums){
            if(num==0)
            zeros++;
            else
            prod*=num;
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeros>1){
                ans[i]=0;
            }
            else if(zeros==1){
                if(nums[i]==0)
                ans[i]=prod;
                else
                ans[i]=0;
            }
            else
            ans[i]=prod/nums[i];
        }
        return ans;
    }
}  
