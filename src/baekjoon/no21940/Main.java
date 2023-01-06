package baekjoon.no21940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    /*
     * 가운데에서 만나기
     * 플로이드-워셜(Floyd-Warshall) 알고리즘
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dist = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i != j) dist[i][j] = 0x3f3f3f3f;
            }
        }

        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            dist[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for (int j=1; j<=n; j++){
                    dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int people_num = Integer.parseInt(st.nextToken());

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<people_num; i++){
            list1.add(Integer.parseInt(st.nextToken()));
        }

        int max = Integer.MAX_VALUE;
        int INF = 0x3f3f3f3f;
        for(int i=1;i<=n;i++) {
            int cur = 0;
            for(int friend : list1) {
                if(dist[friend][i] == INF || dist[i][friend] == INF) cur = Integer.MAX_VALUE;
                cur = Math.max(cur, dist[friend][i] + dist[i][friend]);
            }
            if(max > cur) {
                list2.clear();
                list2.add(i);
                max = cur;
            }
            else if(max == cur) {
                list2.add(i);
            }
        }

        for(int answer : list2){
            System.out.print(answer + " ");
        }


    }
}
