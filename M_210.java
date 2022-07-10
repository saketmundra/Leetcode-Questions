package com.company;

import java.util.ArrayList;
import java.util.*;

public class M_210 {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>(numCourses);
        for(int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<Integer>());
        }
        for(int[] p: prerequisites) {
            int prerequisite = p[1];
            int course = p[0];
            list.get(prerequisite).add(course);
        }
        int vis[]=new int[numCourses+1];
        Stack<Integer> st=new Stack<>();
        int [] ans=new int [numCourses];
        for(int i=0;i<numCourses;i++){

            if(dfs(i,vis,st,list)){
                return ans;
            };

        }

        int ind=0;
        while(!st.isEmpty()){
            ans[ind]=st.pop();
            ind++;
        }
        return ans;

    }
    static boolean dfs(int node, int vis[],Stack<Integer> st, List<List<Integer>> adj) {
        if(vis[node]==1) return false;
        if(vis[node]==2) return true;
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
                if(dfs(it,vis,st,adj)){
                    return false;
                };

        }
        st.push(node);
        vis[node]=2;
        return true;

    }
}
