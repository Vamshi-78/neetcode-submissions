class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int l=i+1,r=n-1;
            int temp=target-numbers[i];
            while(l<=r){
                int m=(l+r)/2;
                if(numbers[m]==temp){
                    return new int[]{i+1,m+1};
                }
                else if(numbers[m]<temp){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }

        }
        return new int[0];
    }
}
