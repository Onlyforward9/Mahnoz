package Codeforces;

import java.util.Scanner;

public class m1948a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if (n % 2 == 1) System.out.println("NO");
            else {
                int i = 0;
                for (; i < n / 2; i++) {
                    if (i % 2 == 0) sb.append("AA");
                    else sb.append("BB");
                }
                System.out.println("YES\n" + sb);
            }
        }
    }
}
