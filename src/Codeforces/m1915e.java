package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1915e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Long> set = new HashSet<>();
            long l = -1, sa = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) sa += sc.nextLong();
                else sa -= sc.nextLong();
                if (set.contains(sa) || sa == 0) l = 1;
                set.add(sa);
            }
            System.out.println(l == 1 ? "YES" : "NO");
        }
    }
}
