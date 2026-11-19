class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int l=0,r=0;
        for(int n:pushed){
            pushed[l++]=n;
            while(l>0&&pushed[l-1]==popped[r]){
                r++;
                l--;
            }
        }
        return l==0;
    }
}
