class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean ans=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j&&nums[i]==nums[j]){
                    ans=false;
                    break;
                }
            }
                if(ans)
                return nums[i];
        }
        return -1;
    }
}
