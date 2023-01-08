package baekjoon.no21941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    /*
     * ㅁ무문묹문자장자여열ㅈ제젝제거
     * - 제거되는 순서에 따라 값이 달라질 수 있다.
     */

     static class pair {
        int siz, score;
        pair(int _siz, int _score){
            this.siz = _siz;
            this.score = _score;
        }
    }

    static List<pair> ava[];
    static int DP[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s = st.nextToken();
        int len = s.length();
        DP = new int[len+1];
        ava = new ArrayList[len];
        for(int i=0;i<len;i++) ava[i] = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            if(a.length() >= x) continue;
            
            int idx = 0;
            while(idx <len){
                int cur = s.indexOf(a, idx);
                if(cur == -1) break;
                ava[cur].add(new pair(a.length(), x));
                idx = cur +1;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<ava[i].size();j++){
                int siz = ava[i].get(j).siz;
                int score = ava[i].get(j).score;
                DP[i + siz] = Math.max(DP[i + siz], DP[i] + score);
            }
            DP[i + 1] = Math.max(DP[i + 1], DP[i] + 1);
        }

        System.out.println(DP[len]);

    }
}
