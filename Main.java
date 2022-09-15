package com.company;
import java.util.*;
import java.io.*;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            HashSet<Integer> case1=new HashSet<Integer>();
            HashSet<Integer> case2=new HashSet<Integer>();
            for(int j=0;j<n;j++){
                int u=sc.nextInt();
                if(!case1.contains(u) && k>case1.size()){
                    case1.add(u);
                }
                else if(!case2.contains(u) && k>case2.size()) {
                    case2.add(u);
                }
            }
            if(case1.size()+case2.size()==n){
                System.out.println("YES");
            }
            if(case1.size()+case2.size()!=n) {
                System.out.println("NO");
            }
        }
        
    }
}
