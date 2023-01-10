package com.company;

import java.util.PriorityQueue;

public class M_1405 {
    public static void main(String[] args) {

    }
    static class Pair {
        public Character ch;
        int count;
        public Pair(Character ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((count1, count2) -> Integer.compare(count2.count, count1.count));
        if(a>0)pq.add(new Pair('a',a));
        if(b>0)pq.add(new Pair('b',b));
        if(c>0)pq.add(new Pair('c',c));

        while (pq.size()>1){
            Pair one=pq.poll();
            if(one.count>=2){
                sb.append(one.ch);
                sb.append(one.ch);
                one.count-=2;
            }
            else if(one.count>=1){
                sb.append(one.ch);
                one.count-=1;
            }
            Pair two=pq.poll();
            if(two.count>=2 && one.count<two.count){
                sb.append(two.ch);
                sb.append(two.ch);
                two.count-=2;
            }
            else if(two.count>=1){
                sb.append(two.ch);
                two.count-=1;
            }

            if(one.count>0)pq.add(new Pair(one.ch,one.count));
            if(two.count>0)pq.add(new Pair(two.ch,two.count));
        }
        if(!pq.isEmpty() && sb.length()<1 || sb.charAt(sb.length()-1)!=pq.peek().ch){
            if (pq.peek().count >= 2) {
                sb.append(pq.peek().ch);
                sb.append(pq.peek().ch);
            } else {
                sb.append(pq.peek().ch);
            }
        }
        return sb.toString();
    }
}
