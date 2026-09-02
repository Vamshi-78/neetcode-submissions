class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int left=0;
        int right=0;
        int maxFreq=0;
        int ans=0;
        while(right<n){
            char currChar=s.charAt(right);
            int currFreq=map.getOrDefault(currChar,0);
            int newFreq=currFreq+1;
            map.put(currChar,newFreq);

            int currWindow=right-left+1;
            maxFreq=Math.max(newFreq,maxFreq);
            if(currWindow-maxFreq>k){
                char leftChar=s.charAt(left);
                int leftcurrFreq=map.getOrDefault(leftChar,0);
                int leftnewFreq=leftcurrFreq-1;
                map.put(leftChar,leftnewFreq);
                left++;
            }
            currWindow=right-left+1;
            ans=Math.max(ans,currWindow);
            right++;
        }
        return ans;
    }
}