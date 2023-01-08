package baekjoon.no21941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            map.put(a, x);   
        }

        int answer =0;

        for(String key : map.keySet()){
            if(key.length()<map.get(key)){
                // find key
                while(true){
                    int idx = s.indexOf(key);
                    if(idx == -1) break;

                    answer += map.get(key);
                    if(idx == 0){
                        s = s.substring(idx+key.length());
                    }else if(idx+key.length() == s.length()){
                        s = s.substring(0, idx);
                    }else{
                        s = s.substring(0, idx) + s.substring(idx+key.length());
                    }
                }
            }
        }

        answer += s.length();
        System.out.println(answer);
    }
}
