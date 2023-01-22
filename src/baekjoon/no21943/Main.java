package baekjoon.no21943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   static int[] arr;
   static int []choose;
    static int []operator;
    static boolean []used;
    static long []values;
    static long answer = 0;
   static int p, q, n;
   public static void main(String[] args) throws IOException {
    /*
     * 연산 최대로
     * 
     * 더하기 끼리 묶이는 것이 최댓값의 결과를 낼 것이므로 곱하기 연산자 갯수 +1개의 숫자그룹을 짓는 모든 경우의 수에 대해 최댓값을 얻으면 정답.
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());

     n = Integer.parseInt(st.nextToken());

     arr = new int[n];
     used = new boolean[n];
     choose = new int[n];
     operator = new int[n];
     values = new long[n];

     st = new StringTokenizer(br.readLine());
     for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(st.nextToken());
     }

     st = new StringTokenizer(br.readLine());
     p = Integer.parseInt(st.nextToken());
     q = Integer.parseInt(st.nextToken());

     dfs(0);
     System.out.println(answer);
   }

   static void dfs(int cnt) {
      if(cnt == n) {
          dfs2(0);
          return;
      }

      for(int i=0;i<n;i++){
          if(used[i]) continue;
          used[i] = true;
          choose[cnt] = arr[i];
          dfs(cnt + 1);
          used[i] = false;
      }
  }

  static void dfs2(int cnt) {
      if(cnt == n - 1) {
          int idx = -1;
          values[++idx] = choose[0];
          for(int i=1;i<n;i++) {
              if(operator[i - 1] == 1) values[++idx] = choose[i];
              else values[idx] += choose[i];
          }
          long curValue = 1;
          for(int i=0;i<=idx;i++) curValue *= values[i];
          answer = Math.max(answer, curValue);
          return;
      }

      if(p > 0) {
          p --;
          operator[cnt] = 0;
          dfs2(cnt + 1);
          p ++;
      }
      if(q > 0) {
          q --;
          operator[cnt] = 1;
          dfs2(cnt + 1);
          q ++;
      }
  }
}
