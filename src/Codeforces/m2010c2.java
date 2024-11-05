package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m2010c2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int p = 1; p < s.length() && p + 1 <= s.length() - p; p++) {
            String a = s.substring(p);
            if (s.startsWith(a) && p + 1 <= a.length()) {
                if (s.length() % 2 == 0 && p == s.length() / 2) continue;
                System.out.println("YES\n" + a);
                return;
            }
        }
        System.out.println("NO");
    }
}
//"abrakadabrakadabra   tabtabt"