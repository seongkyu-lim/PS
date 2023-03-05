package baekjoon.no15649;

import java.io.BufferedReader;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    /*
     * N곽과고과 M(1)
     * 
     * backtracking
     */
    static int n,m;

     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        process("", 0);
     }

     private static void process(String ans, int length){

        if(length == m){
            System.out.println(ans);
            return;
        }

        for(int i=1; i<n+1; i++){
            if(!contain(i, ans)){
                if(ans.length()==0) ans+=Integer.toString(i);
                else ans += " "+Integer.toString(i);
                length +=1;

                process(ans, length);

                if(ans.length() == 1) ans = "";
                else ans = ans.substring(0, ans.length()-2);
                length -=1;
            }
        }
     }

     private static boolean contain(int i, String ans){
        List<String> list = new ArrayList<>();
        String[] arr = ans.split(" ");
        list.addAll(Arrays.asList(arr));
        return list.contains(Integer.toString(i));
     }
}