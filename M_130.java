package com.company;

import java.util.Arrays;

public class M_130 {
    public static void main(String[] args) {

    }
    public void solve(char[][] board) {
        boolean [][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board[0].length;j++){
                vis[i][j]=false;
                if((i==0 || i== board.length-1 || j==0 || j==board[0].length) && board[i][j]=='O'){
                    System.out.println(i+" "+j);
                    dfs(i,j,board,vis);
                }
            }
        }
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board[0].length;j++){
                if(board[i][j]=='O' && vis[i][j]==false){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(int i,int j, char[][] board,boolean [][] vis){
        if(i<0|| j<0|| i>=board.length || j>=board[i].length|| board[i][j]=='X' || vis[i][j]==true) return;
        vis[i][j]=true;
        dfs(i+1,j,board,vis);
        dfs(i-1,j,board,vis);
        dfs(i,j+1,board,vis);
        dfs(i,j-1,board,vis);
    }

}
