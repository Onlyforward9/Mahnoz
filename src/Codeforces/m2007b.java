package Codeforces;

import java.util.Scanner;

public class m2007b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            long max = 0;
            for (int i = 0; i < n; i++) max = Math.max(max, sc.nextInt());
            StringBuilder sb = new StringBuilder();
            while (m-- > 0) {
                String s = sc.next();
                int l = sc.nextInt(), r = sc.nextInt();
                if (max >= l && max <= r) {
                    if (s.equals("+")) max++;
                    else max--;
                }
                sb.append(max + " ");
            }
            System.out.println(sb);
        }
    }
}
