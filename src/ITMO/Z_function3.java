package ITMO;

import java.util.Scanner;

public class Z_function3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String p = sc.next();
            StringBuilder sb = new StringBuilder();
            int k = 0;
            for (int i = 0; i <= s.length() - p.length(); i++) {
                boolean b = true;
                for (int j = 0; j < p.length(); j++) {
                    if (p.charAt(j) != '?' && p.charAt(j) != s.charAt(i + j)) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    k++;
                    sb.append(i + " ");
                }
            }
            System.out.println(k + "\n" + sb);
        }
    }
}
