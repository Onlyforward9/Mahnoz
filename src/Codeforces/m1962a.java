package Codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class m1962a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            PriorityQueue<Long> queue = new PriorityQueue<>();
            for (int i = 0; i < n; i++){
                queue.add(sc.nextLong());
            }
            while (k > 0) {
                long a=queue.poll();
                queue.add(a + 1);
                k--;
            }
            long min = queue.poll();
            long res = min * n;
            long s = 0;
            for (long value : queue){
                if (value==min){
                    s++;
                }
            }
            res -= s;
            System.out.println(res);
        }
    }
}
