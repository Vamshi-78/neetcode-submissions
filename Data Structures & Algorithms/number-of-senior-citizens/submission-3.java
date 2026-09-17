class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String s:details){
            int tens=s.charAt(11)-'0';
            int ones=s.charAt(12)-'0';
            int age=ones+tens*10;
            if(age>60)
            ans++;
        }
        return ans;
    }
}