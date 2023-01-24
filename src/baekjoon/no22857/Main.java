package baekjoon.no22857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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

        int[][] dp = new int[k+1][n+1];

        for(int i=1; i<n+1; i++){
            if(arr[i-1]%2 ==0){
                dp[0][i] = dp[0][i-1]+1;
                for(int j=1; j<k+1; j++){
                    dp[j][i] = dp[j][i-1] +1;
                }
            }else{
                dp[0][i] = 0;
                for(int j=1; j<k+1; j++){
                    dp[j][i] = dp[j-1][i-1];
                }
            }
        }
        int answer = 0;
        for(int i=1; i<n+1; i++){
            answer = Math.max(answer, dp[k][i]);
        }
        System.out.println(answer);
    }
}
