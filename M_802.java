package com.company;
import java.util.*;

public class M_802 {
    public static void main(String[] args) {

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int [] ans=new int[graph.length];
        Arrays.fill(ans,0);
        HashSet<Integer> term=new HashSet<>();
        for(int i=0;i< graph.length;i++){
            if(graph[i].length==0 || (graph[i].length==1 && graph[i][0]==i+1)){
                term.add(i);
                ans[i]=1;
            }
        }
        for(int i=0;i< graph.length;i++){
            boolean find=false;
            for(int j=0;j<graph[i].length;j++){
                if(!term.contains(graph[i][j]))find=true;
            }
            if(find==false)ans[i]=1;
        }
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            if(ans[i]==1)answer.add(i) ;
        }
        return answer;
    }
}
