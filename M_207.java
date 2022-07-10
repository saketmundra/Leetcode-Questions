package com.company;

import java.util.*;

public class M_207 {
    public static void main(String[] args) {

    }
    List<List<Integer>> list;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<Integer>());
        }
        for(int[] p: prerequisites) {
            int prerequisite = p[1];
            int course = p[0];
            list.get(prerequisite).add(course);

        }
        if(has_cycle(numCourses))return new int[0];
        boolean vis[]=new boolean[numCourses+1];
        Arrays.fill(vis,false);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(vis[i]==false){
                dfs(i,vis,st,list);
            }
        }
        int [] ans=new int [numCourses];

        int ind=0;
        while(!st.isEmpty()){
            ans[ind]=st.pop();
            ind++;
        }
        return ans;

    }
    static void dfs(int node, boolean vis[],Stack<Integer> st, List<List<Integer>> adj) {
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it,vis,st,adj);
            }
        }
        st.push(node);

    }
    public boolean has_cycle(int n){
        int[] visited = new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(detect_cycle(visited, i))return true;
            }
        }
        return false;
    }

    public boolean detect_cycle(int[] visited, int c){
        if(visited[c]==1)return true;
        if(visited[c]==2)return false;
        visited[c] = 1;
        for(int i=0;i<list.get(c).size();i++){
            if(detect_cycle(visited, list.get(c).get(i)))return true;
        }
        visited[c] = 2;
        return false;
    }
}
