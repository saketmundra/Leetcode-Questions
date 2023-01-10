package com.company;

public class M_1706 {
    public static void main(String[] args) {

    }
    public int[] findBall(int[][] grid) {
        int m= grid.length; //rows
        int n=grid[0].length; //collumns
        int[] ans=new int[n];
        if(n==1){
            ans[0]=-1;
            return ans;
        }

        for(int b=0;b<n;b++){
            int i=0;
            int j=b;
            boolean fnd=false;
            while(!fnd){
                if(i>=m){
                    ans[b]=j;
                    fnd=true;
                }
                else if((j==0 && grid[i][j]==-1)||(j==n-1 && grid[i][j]==1)){
                    ans[b]=-1;
                    fnd=true;
                }
                else if(grid[i][j]==1 && grid[i][j+1]==1){
                    i++;j++;
                }
                else if(grid[i][j]==-1 && grid[i][j-1]==-1){
                    i++;j--;
                }
                else if((grid[i][j]==1 && grid[i][j+1]==-1)||(grid[i][j]==-1 && grid[i][j-1]==1)){
                    ans[b]=-1;
                    fnd=true;
                }
            }
        }
        return ans;


    }
}
