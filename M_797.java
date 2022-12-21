package com.company;
import java.util.*;
public class M_797 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        ls.add(0);
        sol(0, graph.length-1, graph,ans,ls);
        return ans;
    }
    public static void sol(int src,int dest,int[][] graph,List<List<Integer>> ans,List<Integer> curr){
        if(src==dest){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<graph[src].length;i++){
            curr.add(graph[src][i]);
            sol(graph[src][i],dest,graph,ans,curr);
            curr.remove(curr.size()-1);
        }
        return;
    }
}
