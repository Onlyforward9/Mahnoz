package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class m1701b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), i = 1;
            pw.println(2);
            TreeSet<Integer> set = new TreeSet<>();
            for (int l = 1; l <= n; l++) set.add(l);
            while (!set.isEmpty()) {
                i = set.first();
                while (i <= n) {
                    if (set.contains(i)) {
                        pw.print(i + " ");
                        set.remove(i);
                        i *= 2;
                    } else break;
                }
            }
            pw.println();
        }
        pw.close();
    }
}
