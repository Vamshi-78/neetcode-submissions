class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans=new HashMap<>();
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            ans.putIfAbsent(sortedStr,new ArrayList<>());
            ans.get(sortedStr).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
