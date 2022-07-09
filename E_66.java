package com.company;

import java.util.ArrayList;

public class E_66 {
    public static void main(String[] args) {
        int [] arr={5,6,2,0,0,4,6,2,4,9};
        System.out.println(plusOne(arr));

    }
    static int[] plusOne(int[] digits) {
        int n=digits.length;
        if(digits[n-1]!=9){
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
        else{
            String s="";
            for(int i=0;i<n;i++){
                s+=(char)digits[i];
            }
            int num=Integer.parseInt(s);
            String temp = Integer.toString(num);
            int[] arr=new int[temp.length()];
            for (int i = 0; i < temp.length(); i++){
                arr[i] = temp.charAt(i) - '0';
            }
            return arr;
        }



        }

    }

