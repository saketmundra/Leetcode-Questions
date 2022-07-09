package com.company;

public class M_1344 {
    public static void main(String[] args) {

    }
    public double angleClock(int hour, int minutes) {
        if(hour==12){
            hour=0;
        }
        double mindeg=minutes*5;
        double hrdeg=hour*30+minutes*0.5;
        double total=0;
        if(mindeg>hrdeg) total=mindeg-hrdeg;
        if(mindeg<hrdeg) total=hrdeg-mindeg;
        return Math.min(total,360-total);

    }
}
