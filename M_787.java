package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class M_787 {
    public static void main(String[] args) {

    }
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    class Tuple{
        int first;
        int second;
        int third;
        public Tuple(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m= flights.length;
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<Tuple> qs=new LinkedList<>();
        qs.add(new Tuple(0,src,0));
        int [] dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;

        while (!qs.isEmpty()){
            Tuple it=qs.poll();
            int stops=it.first;
            int node=it.second;
            int cost=it.third;

            if(stops>k)continue;
            for(Pair iter:adj.get(node)){
                int adjNode=iter.first;
                int edwt=iter.second;
                if(cost+edwt<dist[adjNode] && stops<=k){
                    dist[adjNode]=cost+edwt;
                    qs.add(new Tuple(stops+1,adjNode,cost+edwt));
                }
            }
        }

        if(dist[dst]==Integer.MAX_VALUE)return -1;
        else return dist[dst];
    }
    class Fair{
        int no;
        int mul;
        public Fair(int no,int mul){
            this.no=no;
            this.mul=mul;
        }
    }
    int minimumMultiplications(int[] arr, int start, int end) {
        int n=100000;
        Queue<Fair> qs=new LinkedList<>();
        qs.add(new Fair(start,0));
        while(!qs.isEmpty()){
            Fair p=qs.poll();
            int num=p.no;
            int stops=p.mul;
            if(num==end)return stops;
            for(int i=0;i<arr.length;i++){
                qs.add(new Fair((num*arr[i])%n,stops+1));
            }
        }
        return -1;
    }
}
