package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class m2000d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long[] num = new long[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                num[i + 1] = num[i] + arr[i];
            }
            String s = sc.next();
            TreeSet<Integer> set = new TreeSet<>();
            TreeSet<Integer> list = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') set.add(i);
                else list.add(i);
            }
            long res = 0;
            for (int i : set) {
                if (!list.isEmpty()) {
                    int r = list.pollLast();
                    if (r > i) res += num[r + 1] - num[i];
                    else break;
                } else break;
            }
            System.out.println(res);
        }
    }
}
