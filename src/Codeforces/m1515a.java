package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class m1515a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) set.add(sc.nextInt());
            if (set.size() == 1 && set.first() == x) System.out.println("NO");
            else {
                if (set.first() == x) sb.append(set.pollLast() + " ");
                else sb.append(sb.append(set.pollLast()) + " ");
                for (int i : set) sb.append(i + " ");
                System.out.println("YES\n"+sb);
            }
        }
    }
}
