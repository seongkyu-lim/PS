package baekjoon.no21939;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
         * 문제 : 문제 추천 시스템 Version 1
         * 
         * Point : TreeSet (중복된 값 저장 x, 정렬된 상로 관리)
         * 
         * 
         * node 만듥,compareTo만들어서 treeSet에저장 하는 식으로 개선해보자.
         */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         StringTokenizer st = new StringTokenizer(br.readLine());

         int n = Integer.parseInt(st.nextToken());


         Map<Integer, Integer> map = new HashMap<>();

         for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            map.put(p, l);
         }

         st = new StringTokenizer(br.readLine());
         int m = Integer.parseInt(st.nextToken());

         for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(command.equals("recommend")){
                // List<Integer> keyList = new ArrayList<>(map.keySet());
                // keyList.sort((s1, s2)-> s1.compareTo(s2));
                int answer = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                int x = Integer.parseInt(st.nextToken());
                if(x==1){
                    for(Integer key : map.keySet()){
                        if(map.get(key)>max){
                            answer = key;
                            max = map.get(key);
                        }else if(map.get(key)==max){
                            if(key>answer){
                                answer = key;
                            }
                        }
                    }
                    System.out.println(answer);
                }else{
                    for(Integer key : map.keySet()){
                        if(map.get(key)<min){
                            answer = key;
                            min = map.get(key);
                        }else if(map.get(key) == min){
                            if(key<answer){
                                answer=key;
                            }
                        }
                    }
                    System.out.println(answer);
                }
            }else if(command.equals("solved")){
                int p = Integer.parseInt(st.nextToken());
                map.remove(p);
            }else if(command.equals("add")){
                int p = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());

                map.put(p, l);
            }
         }
    }
}
