class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int curr_sum=numbers[l]+numbers[r];
            if(curr_sum==target)
            return new int[]{l+1,r+1};
            else if(curr_sum>target)
            r--;
            else
            l++;
        }
        return new int[0];
    }
}
