package com.company;

import java.util.ArrayList;

public class M_547 {
    public static void main(String[] args) {

    }
    public int findCircleNum(int[][] isConnected) {
        boolean [] visited=new boolean[isConnected.length];
        int ans=0;
        for(int v=0;v<isConnected.length;v++){
            if(visited[v]==false){
                comp(v,isConnected,visited);
                ans++;
            }
        }
        return ans;
    }
    public void comp(int v,int[][] isConnected,boolean [] visited){
        visited[v]=true;
        for(int i=0;i< isConnected[v].length;i++){
            if(visited[i]==false && isConnected[v][i]==1){
                comp(i,isConnected,visited);
            }
        }
    }
}
