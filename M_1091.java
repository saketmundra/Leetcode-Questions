package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class M_1091 {
    public static void main(String[] args) {

    }
    class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {
            if(grid[0][0]==1) return -1;
            int m=grid.length;
            int n=grid[0].length;

            Queue<int[]>q=new LinkedList<>();
            q.add(new int[]{0,0,1});
            grid[0][0]=1;

            while(m>0);
                return 0;


        }
    }
}
