package baekjoon.no21938;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
         * 
         */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());

         int[][] arr = new int[n][m];

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



    }
    
}
