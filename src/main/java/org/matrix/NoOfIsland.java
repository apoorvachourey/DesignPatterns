package org.matrix;

public class NoOfIsland {

        public static int numIslands(char[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {

                        dfs(grid, i, j);
                        count++;
                    }
                }
            }
            return count;
        }

        public static void dfs(char[][] grid, int r, int c) {
            if (
                    r < 0 ||
                            c < 0 ||
                            r >= grid.length ||
                            c >= grid[0].length ||
                            grid[r][c] != '1'
            ) {
                return;
            }
            grid[r][c] = '2';

               //int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
                //int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };

            int[] row = {1,0,-1,0};
            int[] col = {0,1,0,-1};
            for(int i=0;i<4;i++){
                dfs(grid,r+row[i],c+col[i]);
            }

           // dfs(grid, i + 1, j);
           // dfs(grid, i, j + 1);
            //dfs(grid, i - 1, j);
            //dfs(grid, i, j - 1);
        }


    public static void main(String[] args) {
        /*char[][] M = {
                { '1', '1', '0', '0', '0' },
                { '0', '1', '0', '0', '1' },
                { '1', '0', '0', '1', '1' },
                { '0', '0', '0', '0', '0' },
                { '1', '0', '1', '1', '0' }
        };*/

        char[][] M = {
                { '1', '1'},
                { '0', '1' }
        };

        System.out.println(numIslands(M));
    }
    }




