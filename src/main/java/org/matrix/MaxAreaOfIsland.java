package org.matrix;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid){
        int maxArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                maxArea = Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }

    public static int dfs(int[][] grid, int r, int c){
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) return 0;
        grid[r][c]=0;
        int count =1;
        int[] row = {1,-1,0,0};
        int [] col = {0,0,1,-1};

       for(int i=0;i<4;i++){
           // return 1+dfs(grid,r+1,c)+dfs(grid,r-1,0)+dfs(grid,r,c+1)+dfs(grid,r,c-1);
           count = count + dfs(grid,r+row[i],c+col[i]);
        }
       return count;

    }
}
