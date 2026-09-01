class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> arr=new ArrayList<>();
        int total=m*n;
        int lc=0;
        int rc=n-1;
        int ur=0;
        int lr=m-1;
        while(total!=0){
            for(int i=lc;i<=rc;i++){
                arr.add(matrix[ur][i]);
                total--;
            }
            ur++;
            for(int i=ur;i<=lr;i++){
                arr.add(matrix[i][rc]);
                total--;
            }
            rc--;
            if(ur<=lr){
                for(int i=rc;i>=lc;i--){
                    arr.add(matrix[lr][i]);
                    total--;
                }
                lr--;
            }
            if(lc<=rc){
                for(int i=lr;i>=ur;i--){
                    arr.add(matrix[i][lc]);
                    total--;
                }
                lc++;
            }
            
        }
        return arr;
    }
}