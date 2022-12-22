package com.company;

public class E_733 {
    public static void main(String[] args) {

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        drawTree(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    public static void drawTree(int[][] image,int i,int j,int newColor,int pixel){
        if(i<0|| j<0|| i>=image.length || j>=image[i].length||image[i][j]!=pixel|| image[i][j]==newColor) return;
        image[i][j]=newColor;
        drawTree(image,i+1,j,newColor,pixel);
        drawTree(image,i-1,j,newColor,pixel);
        drawTree(image,i,j+1,newColor,pixel);
        drawTree(image,i,j-1,newColor,pixel);
    }
}
