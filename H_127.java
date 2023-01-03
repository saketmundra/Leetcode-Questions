package com.company;
import java.util.*;

public class H_127 {
    public static void main(String[] args) {

    }
    class Pir{
        String word;
        int level;
        public Pir(String word,int level){
            this.word=word;
            this.level=level;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        String let="abcdefghijklmnopqrstuvwxyz";
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            hs.add(wordList.get(i));
        }
        Queue<Pir> qs=new LinkedList<>();
        qs.add(new Pir(beginWord,1));
        hs.remove(beginWord);
        while (!qs.isEmpty()){
            Pir p=qs.poll();
            String s=p.word;
            if(endWord.equals(s))return p.level+1;
            for(int i=0;i<s.length();i++){
                for(char c = 'a'; c <= 'z'; c++) {
                    String ch=s.substring(0,i)+c+s.substring(i+1);
                    if(hs.contains(ch)){
                        hs.remove(ch);
                        qs.add(new Pir(ch,p.level+1));
                    }
                }
            }
        }
        return 0;
    }
}
