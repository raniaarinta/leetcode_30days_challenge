class Solution {
    public void BFS(char[][]grid,int i,int j)
    {
        if(i<0|| i>=grid.length || j<0 ||j>=grid[i].length || grid[i][j]=='0')
        {
             return;
            
        }
        
        grid[i][j]='0';
        //check up 
        BFS(grid,i+1,j);
        //check down
        BFS(grid,i-1,j);
        //check left
        BFS(grid,i,j+1);
        //check right
        BFS(grid,i,j-1);
        
    }
    
    public int numIslands(char[][] grid) {
        int number_island=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    number_island=number_island+1;
                    BFS(grid,i,j);
                }
                
            }
        }
        return number_island;
    }
    
}