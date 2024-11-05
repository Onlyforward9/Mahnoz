package Codeforces;

import java.util.Scanner;

public class m1837c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            String ch = "0";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    sb.append("0");
                    ch = "0";
                } else if (s.charAt(i) == '1') {
                    sb.append("1");
                    ch = "1";
                } else sb.append(ch);
            }
            System.out.println(sb);
        }
    }
}
