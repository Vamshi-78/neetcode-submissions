class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Map<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){

        // }

        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mid%2!=0){
                mid=mid-1;
            }
            if(nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else{
                r=mid;
            }
        }
        return nums[l];
    }
}