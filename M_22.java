package com.company;
import java.util.*;


public class M_22 {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> answer = new ArrayList<>();

            ans(answer,0,0,"", n);
            return answer;

        }
        public void ans(List<String>answer,int op,int cl,String s,int n){
            if(s.length()==n){
                answer.add(s);
                return;
            }
            if(op<n){
                ans(answer,op+1,cl,s+'(',n);
            }
            if(cl<op){
                ans(answer,op,cl+1,s+')',n);
            }




        }
    }
}
