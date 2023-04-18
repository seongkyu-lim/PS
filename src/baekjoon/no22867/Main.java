package baekjoon.no22867;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.StringTokenizer;


// public class Main {
//     private static class Schedule implements Comparable<Schedule>{

//         public Schedule(Integer startTime, Integer endTime){
//             this.startTime = startTime;
//             this.endTime = endTime;
//         }

//         Integer startTime;
//         Integer endTime;

//         public Integer getStartTime() {return this.startTime;}

//         @Override
//         public int compareTo(Schedule o) {
//             return startTime.compareTo(o.startTime);
//         }
//     }
//     public static void main(String[] args) throws IOException {
//         /*
//          * 종점
//          */

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int n = Integer.parseInt(st.nextToken());

//         List<Schedule> list = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             st = new StringTokenizer(br.readLine());
//             String startTime = st.nextToken();
//             String endTime = st.nextToken();
//             list.add(new Schedule(transfrom(startTime), transfrom(endTime)));
//         }

//         // TODO : list startTime 값 기준으로 정렬하기.
//         Collections.sort(list);
//         // for(int i=0; i<list.size(); i++){
//         //     System.out.println(list.get(i).startTime);
//         // }

//         List<Schedule> space = new ArrayList<>();
//         space.add(list.get(0));
//         int answer = 1;

//         for(int i=1; i<n; i++){
//             for(int j=0; j<space.size(); j++){
//                 // TODO : startTime, endTime 값을 비교해서 공간을 생성하거나 하지않거나.
//                 // 생성하지 않으면 answer--; break;
//                 // for문을 끝까지 돌면 생성하는 것임.
//                 if(space.get(j).endTime<= list.get(i).startTime){
//                     space.get(j).endTime = list.get(i).endTime;
//                     answer--;
//                     break;
//                 }
//             }
//             answer++;
//         }
        

//         System.out.println(answer);
//     }

//     private static Integer transfrom(String time){
//         Integer value = 0;
//         value += Integer.parseInt(time.substring(0, 2))*10000000;
//         value += Integer.parseInt(time.substring(3, 5))*100000;
//         value += Integer.parseInt(time.substring(6, 8))*1000;
//         value += Integer.parseInt(time.substring(9));
//         return value;
//     }
// }

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader rd = new FastReader();

        int N = rd.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i = 0; i < N; ++i) {
            String a = rd.next(), b = rd.next();
            arr.add(new Pair(a, 1));
            arr.add(new Pair(b, -1));
        }
        Collections.sort(arr);
        int sum = 0, mx = 0;
        for(int i = 0; i < 2 * N; ++i) {
            sum += arr.get(i).b;
            mx = Math.max(mx, sum);
        }
        System.out.println(mx);
    }

    static class Pair implements Comparable<Pair> {
        String a;
        int b;
        public Pair(String a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Pair o) {
            return a.compareTo(o.a);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}