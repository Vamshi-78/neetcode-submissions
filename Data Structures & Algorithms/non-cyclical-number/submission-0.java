class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
        if(set.contains(n)) return false;
        set.add(n);
        int ans=0;
        while(n>0){
            int dig=n%10;
            n/=10;
            ans+=dig*dig;
        }
        n=ans;
        }
        return true;
    }
}
