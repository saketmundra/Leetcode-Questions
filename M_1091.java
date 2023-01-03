package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class M_1091 {
    public static void main(String[] args) {

    }
    class Solution {
        class Cell{
            int r;
            int c;
            int dis;
            public Cell(int r,int c,int dis){
                this.r=r;
                this.c=c;
                this.dis=dis;
            }
        }
        public int shortestPathBinaryMatrix(int[][] grid) {
            if(grid[0][0]==1){
                return -1;
            }
            if(grid.length==1){
                return 1;
            }
            int [][] ans=new int[grid.length][grid[0].length];

            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[i].length;j++){
                    ans[i][j]=Integer.MAX_VALUE;
                }
            }
            ans[0][0]=0;
            Queue<Cell> qs=new LinkedList<>();
            qs.add(new Cell(0,0,1));
            int[] dr={-1,0,1,0,-1,1,1,-1};
            int[] dc={0,1,0,-1,-1,1,-1,1};

            while (!qs.isEmpty()){
                Cell c=qs.poll();
                int i=c.r;
                int j=c.c;
                int dist=c.dis;
                for(int k=0;k<8;k++){
                    int ner=i+dr[k];
                    int nec=j+dc[k];
                    if(ner>=0 && nec>=0 && ner<grid.length && nec<grid[0].length && grid[ner][nec]==0 && ans[ner][nec]>dist+1){
                        // System.out.println(k+" "+ner+" "+nec+" ");
                        ans[ner][nec]=dist+1;
                        if(ner==grid.length-1 && nec==grid[0].length-1){
                            return dist+1;
                        }
                        qs.add(new Cell(ner,nec,dist+1));
                    }
                }
            }
            return -1;
        }
    }
}
