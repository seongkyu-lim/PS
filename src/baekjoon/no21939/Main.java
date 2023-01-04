package baekjoon.no21939;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

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
         TreeSet<Pair> tree = new TreeSet<>();

         for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            tree.add(new Pair(l,p));
            map.put(p, l);
         }

         st = new StringTokenizer(br.readLine());
         int m = Integer.parseInt(st.nextToken());

         for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(command.equals("recommend")){

                int x = Integer.parseInt(st.nextToken());
                if(x==1){
                    System.out.println(tree.last().second);
                }else{
                    System.out.println(tree.first().second);
                }
            }else if(command.equals("solved")){
                int p = Integer.parseInt(st.nextToken());
                int l = map.get(p);
                tree.remove(new Pair(l,p));
                map.remove(p);
            }else if(command.equals("add")){
                int p = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                tree.add(new Pair(l,p));
                map.put(p, l);
            }
         }
    }

    static class Pair implements Comparable<Pair> {
        int first;
        int second;
        public Pair() { first = second = 0; }
        public Pair(int a, int b) {
            first = a;
            second = b;
        }
        
        @Override
        public int compareTo(Pair o) {
            if(this.first != o.first) return this.first - o.first;
            return this.second - o.second;
        }
    }
}
