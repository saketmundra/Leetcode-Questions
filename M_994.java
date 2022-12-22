package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class M_994 {
    public static void main(String[] args) {

    }
    class Pair{
        int i;
        int j;
        int min;
        Pair(int i,int j,int min){
            this.i=i;
            this.j=j;
            this.min=min;
        }
    }
    public int orangesRotting(int[][] grid) {
        int ans=0;
        Queue<Pair>qs=new LinkedList<>();
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    qs.add(new Pair(i,j,1));
                }
            }
        }
        System.out.println(qs);
        while (qs.isEmpty()){
            Pair p=qs.poll();
            drawTree(grid,p.i+1,p.j,qs,p.min);
            drawTree(grid,p.i-1,p.j,qs,p.min);
            drawTree(grid,p.i,p.j-1,qs,p.min);
            drawTree(grid,p.i,p.j+1,qs,p.min);
            ans=p.min;
        }
        return ans;
    }

    public void drawTree(int[][] arr,int i,int j, Queue<Pair>qs,int min){
        if(i<0|| j<0|| i>=arr.length || j>=arr[i].length|| arr[i][j]==2 || arr[i][j]==0) return;
        qs.add(new Pair(i,j,min+1));
    }
}
