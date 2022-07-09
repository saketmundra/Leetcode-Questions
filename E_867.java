package com.company;

public class E_867 {
    public static void main(String[] args) {

    }
    public int[][] transpose(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        int[][] B = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                B[j][i] = A[i][j];
            }
        }

        return B;


    }
}
