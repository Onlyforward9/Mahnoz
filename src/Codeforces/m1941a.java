package Codeforces;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class m1941a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int i = 0; i < m; i++) {
                int tip = sc.nextInt();
                String ch = sc.next();
                if (ch == "0") {
                    x += tip;
                    if (x % n == 0) {
                        set.add(n);
                        x = n;
                    } else {
                        set.add(x % n);
                        x %= n;
                    }
                } else if (ch == "1") {
                    tip %= n;
                    x = x - tip <= 0 ? n + (x - tip) : x - tip;
                    set.add(x);
                } else {
                    int tt = tip;
                    tt %= n;
                    int a = x - tt <= 0 ? n + (x - tt) : x - tt;
                    tt = tip;
                    int xx = x;
                    xx += tt;
                    if (xx % n == 0) {
                        xx = n;
                    } else {
                        xx %= n;
                    }
                    int b = xx;
                    if (!set.contains(b) && !set.contains(a)) {
                        if (a >= x && b >= x) {
                            set.add(Math.min(a, b));
                            x = Math.min(a, b);
                        } else if (a >= x) {
                            set.add(a);
                            x = a;
                        } else {
                            set.add(b);
                            x = b;
                        }
                    } else if (!set.contains(a)) {
                        set.add(a);
                        x = a;
                    } else {
                        set.add(b);
                        x = b;
                    }
                }
            }
            for (int i : set) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
