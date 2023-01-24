package baekjoon.no21943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
    /*
     * ㅇ여연ㅅ사산 쵳최초최쵣최대댈대로
     */
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());

     int n = Integer.parseInt(st.nextToken());

     int[] arr = new int[n];
     st = new StringTokenizer(br.readLine());
     for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(st.nextToken());
     }

     st = new StringTokenizer(br.readLine());
     int p = Integer.parseInt(st.nextToken());
     int q = Integer.parseInt(st.nextToken());

   } 
}
