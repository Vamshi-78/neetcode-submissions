class Solution {
    public int arrangeCoins(int n) {
        int r=0;
        while(n>r){
            r++;
            n=n-r;
        }
        return r;
    }
}