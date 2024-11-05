package Codeforces;

import java.util.*;

public class m1526c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        long s = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            queue.add(a);
            s += a;
            k++;
            while (s < 0) {
                s -= queue.poll();
                k--;
            }
        }
        System.out.println(k);
    }
}
