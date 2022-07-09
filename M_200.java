package com.company;

public class M_200 {
    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
        boolean [][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='0' && visited[i][j]==false){
                    drawTree(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;

    }
    public static void drawTree(char[][] grid,int i,int j,boolean [][] visited){

        if(i<0|| j<0|| i>=grid.length || j>=grid[i].length||grid[i][j]==1) return;
        visited[i][j]=true;
        drawTree(grid,i+1,j,visited);
        drawTree(grid,i-1,j,visited);
        drawTree(grid,i,j+1,visited);
        drawTree(grid,i,j-1,visited);
    }
}
