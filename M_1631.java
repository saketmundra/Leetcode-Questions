package com.company;

import java.util.PriorityQueue;

public class M_1631 {
    public static void main(String[] args) {

    }
    class Cell{
        int r;
        int c;
        int d;
        public Cell(int r,int c,int d){
            this.r=r;
            this.c=c;
            this.d=d;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int [][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=Integer.MAX_VALUE;
            }
        }
        ans[0][0]=0;
        PriorityQueue<Cell> pq=new PriorityQueue<Cell>((x,y)->x.d-y.d);
        pq.add(new Cell(0,0,0));

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while (!pq.isEmpty()){
            Cell temp=pq.poll();
            int i= temp.r;
            int j=temp.c;
            int dis=temp.d;
            if(i==n-1 && j==m-1)return dis;
            for(int k=0;k<4;k++){
                System.out.println("hh");
                int ner=i+dr[k];
                int nec=j+dc[k];
                if(ner>=0 && nec>=0 && ner<n && nec<m){
                    System.out.println("hh1");
                    int neff=Math.max(Math.abs(heights[i][j]-heights[ner][nec]),dis);
                    if(neff<ans[i][j]){
                        ans[i][j]=neff;
                        pq.add(new Cell(i,j,neff));
                    }
                }
            }
        }
        return 0;
    }
}
