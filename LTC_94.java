package com.company;
import java.util.*;


public class LTC_94 {
    public static void main(String[] args) {

    }
    public int captureForts(int[] forts) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1 || forts[i]==-1){
                ans.add(i);
            }
        }
        int result=0;
        if(ans.size()>0){
            for(int i=0;i<ans.size()-1;i++){
                if(forts[ans.get(i)]*forts[ans.get(i+1)]==-1){
                    result=Math.max(result,Math.abs(ans.get(i+1)-ans.get(i)-1));
                }
            }
        }
        return result;
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> pos=new HashSet<>();
        HashSet<String> neg=new HashSet<>();
        for(int i=0;i< positive_feedback.length;i++){
            pos.add(positive_feedback[i]);
        }
        for(int i=0;i< negative_feedback.length;i++){
            neg.add(negative_feedback[i]);
        }
        PriorityQueue<Integer> l=new PriorityQueue<>();
        int [] scr=new int[student_id.length];
        for(int i=0;i<report.length;i++){
            String str = report[i];
            String[] strArray = null;
            strArray = str.split(" ");
            int score=0;
            for(int j=0;j< strArray.length;j++){
                if(pos.contains(strArray[i]))score+=3;
                if(neg.contains(strArray[i]))score-=1;
            }
            l.add(score);
            scr[i]=score;
            System.out.println();
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<l.size();i++){
            int find=l.poll();
            int minid=Integer.MAX_VALUE;
            for(int j=0;j<scr.length;j++){
                if(scr[j]==find){
                    minid=Math.min(minid,student_id[j]);
                }
            }
            ans.add(student_id[minid]);
            scr[minid]=-1;
            if(ans.size()==k)break;
        }
        return ans;
    }
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {

        return 0;
    }
}
