class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        int[] res=new int[arr.length];
        for(int i=n-1;i>0;i--){
            int curr=arr[i];
            res[i]=max;
            max=Math.max(curr,max);
        }
        res[0]=max;
        return res;
    }
}