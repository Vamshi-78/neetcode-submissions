class Solution {
    public int mySqrt(int x) {
        long res=(int)Math.exp(0.5*Math.log(x));
        if((res+1)*(res+1)<=x)
        res++;
        return (int)res;
    }
}