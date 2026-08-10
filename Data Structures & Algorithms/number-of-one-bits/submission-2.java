class Solution {
    public int hammingWeight(int n) {
        String bs=Integer.toBinaryString(n);
        int count=0;
        for(char c:bs.toCharArray()){
            if(c=='1')
            count++;
        }
        return count;
    }
}
