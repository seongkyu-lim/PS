package baekjoon.no22866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
     * 탑 보기
     * 
     * 시간초과
     * 
     * (stack 이용해서 for문 하나로 해결하는 방법이 있는듯.)
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            int answer1 = 0;
            int answer2 = Integer.MAX_VALUE;
            int targetHeight = arr[i];

            if(i!=n-1){
                for(int j=i+1; j<n; j++){
                    if(arr[j]>targetHeight){
                        answer1++;
                        targetHeight = arr[j];
                        if(j-i<=Math.abs(answer2-i)) answer2 = j;    

                    }
                }
            }

            targetHeight = arr[i];
            
            if(i!=0){
                for(int j=i-1; j>=0; j--){
                    if(arr[j]>targetHeight){
                        answer1++;
                        targetHeight = arr[j];
                        if(i-j<=Math.abs(answer2-i)) answer2 = j;    
                    }
                }
            }
            
            if(answer1 == 0) System.out.println(answer1);
            else System.out.println(answer1+" "+answer2+1);
        }

    }

    /*
     * 정답 c++ 코드.
     */

//     #include<bits/stdc++.h>

// using namespace std;

// int main(){
//     ios::sync_with_stdio(false);
//     cin.tie(0);

//     int N; cin >> N;
//     vector<int> V(N); 
//     for(int i = 0; i < N; i++) cin >> V[i];
//     vector<pair<int, int>> answer(N);
//     deque<pair<int, int>> leftToRight, rightToleft;
//     for(int i = 0; i < N; i++) {
//         while(!leftToRight.empty() && leftToRight.back().first <= V[i]) leftToRight.pop_back();
//         if(!leftToRight.empty()) {
//             answer[i].first += leftToRight.size();
//             answer[i].second = leftToRight.back().second + 1;
//         }
//         leftToRight.emplace_back(V[i], i);
//     }
//     for(int i = N - 1; i >= 0; i--) {
//         while(!rightToleft.empty() && rightToleft.back().first <= V[i]) rightToleft.pop_back();
//         if(!rightToleft.empty()) {
//             answer[i].first += rightToleft.size();
//             if(answer[i].second) {
//                 int L = i - answer[i].second + 1;
//                 int R = rightToleft.back().second - i;
//                 if(L > R) answer[i].second = rightToleft.back().second + 1;
//             }
//             else answer[i].second = rightToleft.back().second + 1;
//         }
//         rightToleft.emplace_back(V[i], i);
//     }
//     for(int i = 0; i < N; i++) {
//         cout << answer[i].first;
//         if(answer[i].first) cout << " " << answer[i].second;
//         cout << '\n';
//     }

//     return 0;
// }
    
}

