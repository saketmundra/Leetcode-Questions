package com.company;

public class M_1334 {
    public static void main(String[] args) {

    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int [][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)mat[i][j]=0;
                else mat[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<edges.length;i++){
            mat[edges[i][0]][edges[i][1]]=edges[i][2];
            mat[edges[i][1]][edges[i][0]]=edges[i][2];
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][k]==Integer.MAX_VALUE || mat[k][j]==Integer.MAX_VALUE)continue;
                    mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                }
            }
        }
        int ans=0;
        int edge=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            boolean dis=false;
            int min=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]<distanceThreshold && mat[i][j]!=Integer.MAX_VALUE){
                    min++;
                }
                else if(mat[i][j]>distanceThreshold && mat[i][j]!=Integer.MAX_VALUE){
                    dis=true;
                }
            }
            if(dis==false && edge>=min){
                edge=min;
                ans=i;
            }
        }
        return ans;


    }
}
