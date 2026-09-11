class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            sorted[i]=heights[i];
        }
        int c=0;
        Arrays.sort(sorted);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sorted[i])
            c++;
        }
        return c;
    }
}