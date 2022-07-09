package com.company;

public class E_415 {
    public static void main(String[] args) {

    }
    public String addStrings(String num1, String num2) {
        String res="" ;
        int i=num1.length()-1;
        int j=num2.length()-1;

        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            //handling cases when one no is 999 and other is 9 so we
            // take 0 for the rest two places
            int val1=i>=0?num1.charAt(i)-'0':0;
            int val2=j>=0?num1.charAt(j)-'0':0;
            i--;
            j--;

            int val=val1+val2+carry;
            res=(val%10)+res;
            carry=val/10;

        }
        return res;

    }
}
