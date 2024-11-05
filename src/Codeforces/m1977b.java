package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class m1977b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean bol=true;
            TreeSet<Long> set = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (; i < n; i++) {
                set.add((long) Math.pow(2, i));
                if ((long) Math.pow(2, i) > n) break;
            }
            i--;
            long l = set.last();
            if (n == l) {
                for (int j = 0; j < i; j++) sb.append("0 ");
                sb.append("1 ");
            } else if (set.contains(l - n)) {
                for (int j = 0; j < i; j++) {
                    if ((long) Math.pow(2, j) == l - n)
                        sb.append("-1 ");
                    else sb.append("0 ");
                }
                sb.append("0 1 ");
            } else {
                long p;
                int s = 0, m = 0;
                bol = false;
                out:
                for (long a : set) {
                    m = 0;
                    for (long b : set) {
                        if (a + b == n) {
                            bol = true;
                            break out;
                        }
                        m++;
                    }
                    s++;
                }
                for (int j = 0; j <= i && bol; j++) {
                    if (j == s || j == m) sb.append("1 ");
                    else sb.append("0 ");
                }
                if (bol) sb.append("0 ");
                if (!bol) {
                    p = l - n;
                    s = 0;
                    m = 0;
                    out:
                    for (long a : set) {
                        m = 0;
                        for (long b : set) {
                            if (a - b == p * -1) {
                                bol = true;
                                break out;
                            }
                            m++;
                        }
                        s++;
                    }
                    if (bol) {
                        for (int j = 0; j < i; j++) {
                            if (j == s) sb.append("1 ");
                            else if (j == m) sb.append("-1 ");
                            else sb.append("0 ");
                        }
                        sb.append("0 1");
                    } else {
                        s = 0;
                        m = 0;
                        p = (long) Math.pow(2, i + 1) - n;
                        out:
                        for (long a : set) {
                            m = 0;
                            for (long b : set) {
                                if (a + b == p) {
                                    bol=true;
                                    break out;
                                }
                                m++;
                            }
                            s++;
                        }
                        if (bol) {
                            for (int j = 0; j < i; j++) {
                                if (j == s || j == m) sb.append("-1 ");
                                else sb.append("0 ");
                            }
                            sb.append("0 1");
                        }
                    }
                }
            }
            if (!bol){
                set.pollLast();
                long p = n-set.last();
                int s = 0;
                int m = 0;
                out:
                for (long a : set) {
                    m = 0;
                    for (long b : set) {
                        if (a - b == p * -1) break out;
                        m++;
                    }
                    s++;
                }
                for (int j = 0; j < i; j++) {
                    if (j == s) sb.append("-1 ");
                    else if (j == m) sb.append("1 ");
                    else sb.append("0 ");
                }
                sb.append("1");
                pw.println((i+1)+"\n"+sb);
            }else pw.println((l == n ? (i + 1) : (i + 2)) + "\n" + sb);
        }
        pw.close();
    }
}
