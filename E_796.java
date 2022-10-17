package com.company;

public class E_796 {
    public static void main(String[] args) {

    }
    public boolean rotateString(String s, String goal) {
        if(s==goal) return true;
        for(int i=0;i<s.length();i++){
            if(s.substring(i+1)+s.substring(0,i+1)==goal) return true;
        }
        return false;

    }
}
