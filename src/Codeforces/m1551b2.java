package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class m1551b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i;
            }
            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            int[] num = new int[n];
            int l = 0;
            int m = arr[0][0];
            int p = k;
            for (int i = 0; i < n; i++) {
                if (arr[i][0] == m) l++;
                else {
                    m = arr[i][0];
                    l = 1;
                }
                if (l <= k) {
                    num[arr[i][1]] = p;
                    p--;
                }
                if (p == 0) p = k;
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < num.length; i++) {
                if (num[i] > p && !set.contains(num[i])) {
                    set.add(num[i]);
                    num[i] = 0;
                }
                pw.print(num[i] + " ");
            }
            pw.println();
        }
        pw.close();
    }
}
