package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class m1669f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        TreeSet<Long> set = new TreeSet<>();
        long s = 0;
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            s += arr[i];
            set.add(s);
        }
        set.pollLast();
        long max = 0;
        s = 0;
        for (Integer integer : arr) {
            s += integer;
            if (set.contains(s)) max = Math.max(max, s);
            set.pollLast();
        }
        pw.println(max);
        pw.close();
    }
}
