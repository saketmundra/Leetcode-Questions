package com.company;

import java.util.HashSet;

public class M_73 {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> i1=new HashSet<>();
        HashSet<Integer> j1=new HashSet<>();//O(N)

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    i1.add(i);
                    j1.add(j);
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i1.contains(i)|| j1.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        //TC-O(N2)
        //SC-O(N)


    }

}
