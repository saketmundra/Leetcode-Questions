package com.company;

public class M_6 {
    public static void main(String[] args) {

    }
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        String [] arr=new String[numRows];
        for(int i=0;i<arr.length;i++){
            arr[i]="";
        }
        int len=0;
        int dir=1;
        int k=0;
        while (len<s.length()){
            if(dir==1){
                arr[k]=arr[k]+s.charAt(len);
                len++;
                k++;
            }
            else if(dir==0){
                arr[k]=arr[k]+s.charAt(len);
                len++;
                k--;
            }
            if(k==numRows){
                k=k-2;
                dir=0;
            }
            else if(k==-1){
                k=k+2;
                dir=1;
            }
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i];
        }
        return ans;

    }
}
