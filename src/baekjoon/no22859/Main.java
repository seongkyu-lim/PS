package baekjoon.no22859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * HTML 파싱
         * 
         * indexOf() 메소드에 두번째인자로 조회 시작 인덱스를 지정해줄 수 있다. (지정된 인덱스 이후로 조회함.)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String html = br.readLine();
        
        int L = 0, N = html.length();
        while(L < N) {
            int index = html.indexOf("title=\"", L);
            if(index == -1) break;
            int end_title = html.indexOf("\">", index);
            int end_tag   = html.indexOf("</div>", index);
            String title  = html.substring(index + 7, end_title);
            System.out.println("title : " + title);

            int cursor = L;
            while(true) {
                int start_p_tag = html.indexOf("<p>", cursor);
                if(start_p_tag == -1) break;
                if(start_p_tag >  end_tag) break;
                int end_p_tag = html.indexOf("</p>", start_p_tag);
                String paragraph = html.substring(start_p_tag + 3, end_p_tag);
                String erased = erase_simple_tag(paragraph);
                System.out.println(erased);
                cursor = end_p_tag;
            }
            L = end_tag;
        }
    }

    static String erase_simple_tag(String line) {
        String ret = "";
        boolean space = true;
        boolean bracket_open = false;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '>') {
                bracket_open = false;
                continue;
            }

            if(line.charAt(i) == '<') {
                bracket_open = true;
                continue;
            }

            if(bracket_open) continue;
            if(line.charAt(i) == ' ') {
                if(space) continue;
                space = true;
                ret += line.charAt(i);
            }
            else {
                space = false;
                ret += line.charAt(i);
            }
        }
        return ret.trim();
    }
}
