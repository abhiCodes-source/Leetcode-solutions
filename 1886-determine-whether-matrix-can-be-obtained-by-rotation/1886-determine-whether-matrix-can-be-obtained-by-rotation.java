class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public boolean check(int[][] mat,int[][] target) {
        int n = mat.length;
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return true;
        }
        return false;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        boolean flag = true;
        for(int i=1;i<=4;i++){
            rotate(mat);
            flag=check(mat,target);
            if (flag) return true;
        }
        return false;
    }
}