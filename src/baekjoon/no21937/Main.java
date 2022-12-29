package baekjoon.no21937;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    /*
     * 문제이름 : 작업
     * 
     */

    static ArrayList<Integer>[] arr;
    static int answer;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
       
        arr = new ArrayList[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            arr[b].add(a);            
        }
        st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());

        findLeafNode(target-1);

        System.out.println(answer);

    }

    private static void findLeafNode(int a){
        if(arr[a].size() == 0) return;
        for(int value : arr[a]){
            if(visited[value]) continue;
            answer++;
            visited[value] = true;
            findLeafNode(value);
        }
    }
    
}