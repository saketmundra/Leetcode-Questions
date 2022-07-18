package com.company;

/**
 * M_695
 */
public class M_695 {

    public static void main(String[] args) {

    }

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == false) {
                    int area = drawTree(grid, i, j, visited);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public static int drawTree(int[][] arr, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 0 || visited[i][j] == true)
            return 0;
        visited[i][j] = true;
        return 1 + drawTree(arr, i + 1, j, visited) + drawTree(arr, i - 1, j, visited)
                + drawTree(arr, i, j + 1, visited) + drawTree(arr, i, j - 1, visited);
    }
}