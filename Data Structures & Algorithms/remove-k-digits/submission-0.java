class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:num.toCharArray()){
            while(k>0&&sb.length()>0&&sb.charAt(sb.length()-1)>c){
                sb.setLength(sb.length()-1);
                k--;
            }
            sb.append(c);
        }
        sb.setLength(sb.length()-k);
        int f=0;
        while(f<sb.length()&&sb.charAt(f)=='0')
        f++;
        return f==sb.length()?"0":sb.substring(f);
    }
}
