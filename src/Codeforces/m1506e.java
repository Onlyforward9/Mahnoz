package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class m1506e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            TreeSet<Integer> queue1 = new TreeSet<>();
            TreeSet<Integer> queue2 = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            StringBuilder bb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                queue2.add(i);
                queue1.add(i);
            }
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                queue2.remove(p);
                queue1.remove(p);
                if (!set.contains(p)) {
                    sb.append(p + " ");
                    bb.append(p + " ");
                    set.add(p);
                } else {
                    sb.append(queue2.pollFirst() + " ");
                    int m = queue1.floor(p);
                    bb.append(m + " ");
                    queue1.remove(m);
                }
            }
            pw.println(sb);
            pw.println(bb);
        }
        pw.close();
    }
}
