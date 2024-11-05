package Codeforces;

import java.util.*;

public class m1256d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            char[] arr = sc.next().toCharArray();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < arr.length; i++) if (arr[i] == '0') set.add(i);
            int start = 0;
            while (k > 0 && !set.isEmpty()) {
                int f = set.first();
                if (arr[start] == '1') {
                    long r = Math.min(f - start, k);
                    arr[(int) (f - r)] = '0';
                    arr[f] = '1';
                    k -= r;
                    set.pollFirst();
                }
                start++;
                if (f < start) set.pollFirst();
            }
            StringBuilder sb = new StringBuilder();
            for (int i : arr) sb.append(i == 48 ? "0" : "1");
            System.out.println(sb);
        }
    }
}
