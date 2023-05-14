package baekjoon.no9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * ㅍ파도반 수열
         */

        List<Long> list = new ArrayList<>();
        list.add((long) 1);
        list.add((long) 1);
        list.add((long) 1);
        list.add((long) 2);
        list.add((long) 2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        for(int i=0; i<testNum; i++){
            int num = Integer.parseInt(br.readLine());
            if(list.size()<num){
                // 해당되는 값까지 계산해서 넣어주기.
                while(list.size() <= num){
                    int lastIdx = list.size()-1;
                    list.add(list.get(lastIdx)+list.get(lastIdx-4));
                }
                System.out.println(list.get(num-1));
            }else{
                System.out.println(list.get(num-1));
            }
        }
    }
    
}
