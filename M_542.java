package com.company;

import java.util.Arrays;
import java.util.*;

public class M_542 {
    public static void main(String[] args) {

    }
    class Trip{
        int i;
        int j;
        int dis;
        Trip(int i,int j,int dis){
            this.i=i;
            this.j=j;
            this.dis=dis;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans=new int[mat.length][mat[0].length];
        Arrays.fill(ans,0);
        boolean[][] vis=new boolean[mat.length][mat[0].length];

        Queue<Trip> qs=new LinkedList<>();
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    vis[i][j]=true;
                    qs.add(new Trip(i,j,0));
                }
                else vis[i][j]=false;
            }
        }
        while (!qs.isEmpty()){
            Trip ts=qs.poll();
            ans[ts.i][ts.j]=ts.dis;

            if(ts.i>0 && vis[ts.i-1][ts.j]==false) {
                vis[ts.i][ts.j]=true;
                qs.add(new Trip(ts.i - 1, ts.j, ts.dis + 1));
            };
            if(ts.j>0 && vis[ts.i][ts.j-1]==false){
                vis[ts.i][ts.j]=true;
                qs.add(new Trip(ts.i,ts.j-1,ts.dis+1));
            }
            if(ts.i<mat.length-1 && vis[ts.i+1][ts.j]==false){
                vis[ts.i][ts.j]=true;
                qs.add(new Trip(ts.i+1,ts.j,ts.dis+1));
            }
            if(ts.j<mat[0].length-1 && vis[ts.i][ts.j+1]==false){
                vis[ts.i][ts.j]=true;
                qs.add(new Trip(ts.i,ts.j+1,ts.dis+1));
            }
        }
        return ans;
    }


}
