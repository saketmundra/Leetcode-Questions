package com.company;

public class M_79 {
    public boolean exist(char[][] board, String word) {
        int n= board.length;
        int m= board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]!=word.charAt(0)) continue;
                boolean res=explore(board,i,j,0,word);
                if(res==true) return res;
            }
        }
        return false;

    }


    public static boolean explore(char[][] board,int i,int j,int si,String s){
        int [] di={-1,0,1,0};
        int [] dj={0,-1,0,1};

        if(si==s.length()) return true;
        if(i<0||j<0||i>= board.length||j>=board[0].length ) return false;
        if(s.charAt(si)!=board[i][j]) return false;

        char mychar=board[i][j];
        board[i][j]='@';
        for(int d=0;d<4;d++){
            boolean res=explore(board,i+di[d],j+dj[d],si+1,s);
            if(res){
                board[i][j]=mychar;
                return true;
            }
        }
        return false;
    }

}
