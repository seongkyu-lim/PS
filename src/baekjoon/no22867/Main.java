package baekjoon.no22867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 종점
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        List<String[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String startTime = st.nextToken();
            String endTime = st.nextToken();
            String[] arr = {startTime, endTime};
            list.add(arr);
        }

        // TODO : list startTime 값 기준으로 정렬하기.

        List<String[]> space = new ArrayList<>();
        space.add(list.get(0));
        int answer = 1;

        for(int i=1; i<n; i++){
            for(int j=0; j<space.size(); j++){
                // TODO : startTime, endTime 값을 비교해서 공간을 생성하거나 하지않거나.
                // 생성하지 않으면 answer--; break;
                // for문을 끝까지 돌면 생성하는 것임.
            }
            answer++;
        }
        

        System.out.println(answer);
    }
}