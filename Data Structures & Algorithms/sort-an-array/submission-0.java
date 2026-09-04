class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for (int i=n/2-1;i>=0;i--) {
            heapify(nums,n,i);
        }
        for(int end=n-1;end>0;end--){
            int temp=nums[0];
            nums[0]=nums[end];
            nums[end]=temp;

            heapify(nums,end,0);
        }
        return nums;
    }
    static void heapify(int[] arr,int n,int i){
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;

        if(left<n&&arr[left]>arr[largest])
        largest=left;

        if(right<n&&arr[right]>arr[largest])
        largest=right;

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }
}