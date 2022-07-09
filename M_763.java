package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;
import java.util.*;

public class M_763 {
    public static void main(String[] args) {

    }

    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int len=0;
        int end=-1;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int last=map.get(ch);
            end=Math.max(end,last);
            len++;

            if(i==end){
                list.add(len);
                len=0;
            }
        }
        return list;








    }
}
