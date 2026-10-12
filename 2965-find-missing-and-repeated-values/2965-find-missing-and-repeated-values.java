class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int a=0;
        int b=0;
        for(int m=1;m<n*n;m++){
            if(arr[m]==arr[m-1]){
                b=arr[m];
                break;
            } 
        }
        for(int i=1;i<=n*n;i++){
            int found=0;
            for(int j=0;j<n*n;j++){
                if(arr[j]==i){
                    found=1;
                    break;
                }
            }
            if(found==0){
                a=i;
                break;
            }
        }
        return new int[]{b,a};
    }
}