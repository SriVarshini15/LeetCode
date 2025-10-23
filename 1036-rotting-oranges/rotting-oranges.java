class Solution {
    public int orangesRotting(int[][] grid) {
        int good=0,r=grid.length,c=grid[0].length,t=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    good++;
                }
            }
        }
        boolean temp=false;
        for(int k=0;k<r*c;k++){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i+1!=r && grid[i][j]==2 && grid[i+1][j]==1){
                        grid[i+1][j]=9;
                        temp=true;
                    }
                    if(j+1!=c && grid[i][j]==2 && grid[i][j+1]==1){
                        grid[i][j+1]=9;
                        temp=true;
                    }
                    if(i-1>=0 && grid[i][j]==2 && grid[i-1][j]==1){
                        grid[i-1][j]=9;
                        temp=true;
                    }
                    if(j-1>=0 && grid[i][j]==2 && grid[i][j-1]==1){
                        grid[i][j-1]=9;
                        temp=true;
                    }
                }
            }
            if(temp){
                t++;
                temp=false;
            }
            change(grid,r,c);
        }
        if(!check(grid,r,c)){
            return -1;
        }
        return t;

    }
    public static void change(int grid[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==9){
                    grid[i][j]=2;
                }
            }
        }
    }
    public static boolean check(int grid[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }

}