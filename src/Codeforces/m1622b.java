package Codeforces;

import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class m1622b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            PriorityQueue<Integer> queue1 = new PriorityQueue<>();
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int k_1 = s.replace("1", "").length() + 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (arr[i] < k_1) queue1.add(arr[i]);
                } else {
                    if (arr[i] >= k_1) queue.add(arr[i]);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (arr[i] >= k_1) sb.append(arr[i] + " ");
                    else sb.append(queue.poll() + " ");
                } else {
                    if (arr[i] < k_1) sb.append(arr[i] + " ");
                    else sb.append(queue1.poll()+" ");
                }
            }
            pw.println(sb);
        }
        pw.close();
    }
}
