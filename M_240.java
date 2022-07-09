package com.company;

public class M_240 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0]<target){
                int s=0;
                int e=matrix[0].length-1;
                while (s<=e){
                    int m=(s+e)/2;
                    if(target> matrix[i][m]) s=m+1;
                    else if(target<matrix[i][m]) e=m-1;
                    else return true;
                }

            }
        }
        return false;


    }


}
