package com.company;

public class M_74 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=0;
            for(int i=0;i< matrix.length;i++){
                if(matrix[i][matrix[0].length-1]>target){
                    k=i;
                    break;
                }
                else if(matrix[i][matrix[0].length-1]==target){
                    return true;
                }
            }
        int s=0;
        int e=matrix[0].length-1;
        while (s<=e){
            int m=(s+e)/2;
            if(target> matrix[k][m]) s=m+1;
            else if(target<matrix[k][m]) e=m-1;
            else return true;
        }
        return false;
    }
}
