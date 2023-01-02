package baekjoon.no21938;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] visited;
    static int[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int n,m, t;

    public static void main(String[] args) throws IOException{
        /*
         * 영상처리 
         * 
         *
         */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

         arr = new int[n][m];

         for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                int sum = 0;
                for(int k=0; k<3; k++){
                    sum += Integer.parseInt(st.nextToken());
                }
                arr[i][j] = sum/3;
            }
         }

        //  System.out.println(Arrays.deepToString(arr));

         st = new StringTokenizer(br.readLine());

         t = Integer.parseInt(st.nextToken());

         visited = new boolean[n][m];

         int answer = 0;
         for(int i=0; i<n; i++){
            for(int j=0; j<m ;j++){
                if(visited[i][j]) continue;

                if(arr[i][j]>=t) {
                    answer++;
                    dfs(i, j);
                }else{
                    visited[i][j] = true;
                }
            }
         }

         System.out.println(answer);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        for (int k=0; k<4; k++){
            int nx = i+dir[k][0];
            int ny = j+dir[k][1];

            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(visited[nx][ny]) continue;
            if(arr[nx][ny]<t) {
                visited[nx][ny] = true;
                continue;
            }
            dfs(nx,ny);
        }
    }

}
