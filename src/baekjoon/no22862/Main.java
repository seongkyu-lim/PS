package baekjoon.no22862;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
     * 가장 긴 짝수 연속한 부분 수열 (large)
     * 투 포인터
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int erase_count = 0;
        int answer = 0;

        for(int i = 0, r = 0; i < n; i++) {
            while(r < n) {
                if(arr[r] % 2 == 0) r ++;
                else {
                    if(erase_count == k) break;
                    erase_count ++;
                    r ++;
                }
            }
            answer = Math.max(answer, r - i - erase_count);
            if(arr[i] % 2 == 1) erase_count --;
        }
        System.out.println(answer);
    }
}
