class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toString(n);
        int res=Integer.bitCount(n);
        return res;
    }
}
