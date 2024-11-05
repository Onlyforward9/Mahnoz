package Codeforces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class m1579e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            Deque<Integer> deque = new ArrayDeque<>();
            deque.add(s);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                if (a < s) {
                    deque.addFirst(a);
                    s = a;
                } else deque.addLast(a);
            }
            String res = deque.toString();
            res=res.replace(",", "");
            System.out.println(res.substring(1, res.length() - 1));
        }
    }
}
