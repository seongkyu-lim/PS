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

   } 
}
