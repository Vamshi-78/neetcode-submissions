class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
            if(i==0)
            ans[i]=0;
            else if(i==1)
            ans[i]=1;
            else {
                String s=Integer.toBinaryString(i);
                for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1')
                count++;
                }
                ans[i]=count;
            }
            count=0;
        }
        return ans;
    }
}
