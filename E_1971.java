package com.company;

public class E_1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        return hasPath(edges,source,destination);

    }
    public static boolean hasPath(int[][] edges,int src,int dest){
        if(src==dest) return true;
        for(int i=0;i<edges.length;i++){
            if(edges[i][0]==src){
                boolean npath=hasPath(edges,edges[i][1],dest);
                if(npath==true) return true;
            }
        }
        return false;

    }

}
