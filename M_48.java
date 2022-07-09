package com.company;

public class M_48 {
    public static void main(String[] args) {

    }
    public void rotate(int[][] arr) {
        //changing i and j position of every value in matrix.
        for (int i=0; i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //mirror image of matrix.
        for(int i=0; i< arr.length;i++){
            int li=0;
            int ri=arr[i].length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]= temp;

                li++;
                ri--;
            }

        }



    }
}
