package baekjoon.no22856;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    /*
     * 트리 순회
     * 
     * 
     * 아이디어 캐치.
     * 해당 문제에서 오른쪽 젤끝 리프노드로 가는 길만 한번씩만 지나간다.
     * 따라서 전체 간선 *2의 갯수에서 오른쪽 리프노드로가는 간선의 갯수를 뺴주면 정답!
     */

    static int [][]tree;
    public static void main(String[] args) {
        FastReader rd = new FastReader();

        int N = rd.nextInt();
        tree = new int[N + 1][2];

        for(int i = 0; i < N; i++) {
            int id = rd.nextInt();
            int leftChild = rd.nextInt();
            int rightChild = rd.nextInt();
            tree[id][0] = leftChild;
            tree[id][1] = rightChild;
        }

        int ans = 2 * (N - 1);
        for(int i = 1; tree[i][1] != -1; i = tree[i][1]) ans --;
        System.out.println(ans);
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
