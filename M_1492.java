package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M_1492 {
    public static void main(String[] args) {

    }
    public int kthFactor(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=1;
        int j=n;
        while(i<j){
            if(n%i==0){
                j=n/i;
                if(i!=j){
                    ans.add(i);
                }
                ans.add(j);

            }
            i++;
        }
        Collections.sort(ans);
        if(k>ans.size()) return -1;
        return ans.get(k);


    }
}
