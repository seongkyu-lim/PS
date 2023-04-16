package baekjoon.no22864;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 피로도
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int k = 0;
        int answer = 0;
        int cnt = 0;

        while(cnt != 24){
            cnt++;
            if(k+a <= m) {
                answer += b;
                k += a;
            }else{
                k -= c;
                if (k < 0) k =0;
            }
         }
        System.out.println(answer);
    }
}