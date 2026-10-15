class Solution {
    public int[][] dfs(int[][] image, int r, int c,int old_color, int color){
        image[r][c]=color;
        if(r-1>=0 && image[r-1][c]==old_color){
            dfs(image,r-1,c,old_color,color);
        }
        if(c-1>=0 && image[r][c-1]==old_color){
            dfs(image,r,c-1,old_color,color);
        }
        if(r+1<image.length && image[r+1][c]==old_color){
            dfs(image,r+1,c,old_color,color);
        }
        if(c+1<image[0].length && image[r][c+1]==old_color){
            dfs(image,r,c+1,old_color,color);
        }
        return image;        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old_color=image[sr][sc];
        if(old_color==color) return image;
        dfs(image,sr,sc,old_color,color);
        return image;
    }
}