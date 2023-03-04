package baekjoon.no2661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int N;

    public static void main(String[] args) throws IOException {
        /*
         * 좋은수열
         * 
         * 백트래킹 분류로 되었지만 완전한 백트래킹 문제는 아니라고 생각된다.
         * 첫번째 부터 문자열 길이를 늘려가면서 조건에 맞도록 체크하면서 가장 작은 수의 나열이 되도록 최적화해나가면 됨.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        backtracking("");
    }

    private static void backtracking(String result) {
        if (result.length() == N) {
            System.out.println(result);
            System.exit(0);

        } else {
            for (int i = 1; i <= 3; i++) {
                if (isGoodSequence(result + i)) {
                    backtracking(result + i);
                }
            }
        }
    }

    private static boolean isGoodSequence(String s) {
        int length = s.length() / 2;

        for (int i = 1; i <= length; i++) {
            if (s.substring(s.length() - i).equals(s.substring(s.length() - 2 * i, s.length() - i))) {
                return false;
            }
        }

        return true;
    }
    
}
