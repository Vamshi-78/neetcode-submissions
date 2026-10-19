class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k<0){
            k+=n;
        }
            rev(nums,0,n-1);
            rev(nums,0,k-1);
            rev(nums,k,n-1);
    }
    static void rev(int nums[],int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}