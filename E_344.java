package com.company;

public class E_344 {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(j>i){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

    }
}
