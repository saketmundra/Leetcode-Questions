package com.company;
import java.util.*;

public class E_118 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> allrows = new ArrayList<List<Integer>>();
            List<Integer> row,pre=null;
            for(int i=0;i<numRows;i++){
                row=new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){
                        row.add(1);
                    }
                    else {
                        row.add(pre.get(j-1)+ pre.get(j));
                    }
                }
                pre=row;
                allrows.add(row);
            }
            return allrows;
        }
    }
}
