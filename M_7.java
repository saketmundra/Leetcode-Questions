package com.company;

public class M_7 {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        if(x<10 && x>-10) {
            return x;
        }
        long answer = 0;
        while(x!=0) {
            answer = answer * 10 + x%10;
            x /= 10;
        }
        return answer>=Integer.MIN_VALUE && answer <= Integer.MAX_VALUE ? (int)answer:0;

    }
}
