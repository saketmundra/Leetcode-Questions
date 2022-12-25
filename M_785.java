package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class M_785 {
    public static void main(String[] args) {

    }
    public boolean isbp(int i,int[][] graph,int[] color){
        Queue<Integer> qs=new LinkedList<>();
        qs.add(i);
        color[i]=0;
        while (!qs.isEmpty()){
            int node=qs.poll();
            for(int j=0;j<graph[node].length;j++){
                if(color[j]==-1){
                    color[j]=color[node]==0?1:0;
                }
                else if(color[j]==color[node]){
                    return false;
                }
            }

        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int [] color=new int[graph.length];
        Arrays.fill(color,-1);

        for(int i=0;i< graph.length;i++){
            if(color[i]==-1){
                if(isbp(i,graph,color)==false)return false;
            }
        }
        return true;
    }
}
