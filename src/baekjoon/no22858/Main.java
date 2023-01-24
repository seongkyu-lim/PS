package baekjoon.no22858;

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
        
        int[] s = new int[n];
        int[] d = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            s[i]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            d[i]= Integer.parseInt(st.nextToken());
        }
        
        int[] answer = new int[n];
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                answer[d[j]-1] = s[j];
            }
            for(int j=0; j<n; j++){
                s[j] = answer[j];
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(answer[i]+" ");
        }


    }
    
}
