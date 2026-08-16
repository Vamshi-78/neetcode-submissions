class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean[] rZ=new boolean[r];
        boolean[] cZ=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rZ[i]=true;
                    cZ[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rZ[i]||cZ[j])
                matrix[i][j]=0;
            }
        }
    }
}
