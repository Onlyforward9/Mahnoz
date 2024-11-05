package Codeforces;

import com.sun.source.util.Trees;

import java.util.*;

public class m1517b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            TreeSet<Integer>[] arr = new TreeSet[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new TreeSet<>();
                for (int j = 0; j < m; j++) {
                    arr[i].add(sc.nextInt());
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i % 2 == 0) sb.append(arr[i].pollFirst() + " ");
                    else sb.append(arr[i].pollLast() + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
//2 7 3
//1 6 4
//8 2 6

