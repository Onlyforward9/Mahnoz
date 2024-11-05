package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m2005b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) set.add(sc.nextInt());
            for (int i = 0; i < q; i++) {
                int qq = sc.nextInt();
                Integer end = set.ceiling(qq);
                Integer start = set.floor(qq);
                if (start == null) sb.append((end - 1) + " ");
                else if (end == null) sb.append((n - start) + " ");
                else {
                    int min = Math.min(qq - start, end - qq) - 1;
                    int max = Math.max(qq - start, end - qq);
                    sb.append((min + (max - min - 1) / 2 + 1) + " ");
                }
            }
            System.out.println(sb);
        }
    }
}
