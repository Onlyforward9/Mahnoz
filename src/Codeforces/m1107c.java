package Codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class m1107c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long res = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            long r = 0, kk = i;
            PriorityQueue<Long> queue = new PriorityQueue<>();
            while (i < n && s.charAt(i) == ch) {
                queue.add(arr[i]);
                r += arr[i];
                i++;
            }
            long o = Math.max(0, i - kk - k);
            while (o-- > 0) r -= queue.poll();
            res += r;
            i--;
        }
        System.out.println(res);
    }
}
