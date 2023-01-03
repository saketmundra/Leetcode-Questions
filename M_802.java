package com.company;
import java.util.*;

public class M_802 {
    public static void main(String[] args) {

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int [] vis= new int [graph.length];
        int [] pvis=new int[graph.length];
        int [] check=new int[graph.length];
        for(int i=0;i< graph.length;i++){
            if(vis[i]==0){
                checkforcycle(i,vis,pvis,check,graph);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i< graph.length;i++){
            if(check[i]==1){
                ans.add(i);
            }
        }
        return ans;
    }
    static boolean checkforcycle(int node,int vis[],int [] pvis,int [] check,int[][] graph){
        vis[node]=1;
        pvis[node]=1;
        check[node]=0;
        for(int i=0;i<graph[node].length;i++){
            Integer it=graph[node][i];
            if(vis[it]==0){
                if(checkforcycle(it,vis,pvis,check,graph)==true)return true;
            }
            else if(pvis[it]==1){
                return true;
            };
        }
        check[node]=1;
        pvis[node]=0;
        return false;
    }

}
