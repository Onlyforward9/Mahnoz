package Codeforces;

import java.util.Scanner;

public class m1473a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            int[] minl = new int[n + 1];
            int[] maxl = new int[n + 1];
            int[] vals = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '-') vals[i + 1] = vals[i] - 1;
                else vals[i + 1] = vals[i] + 1;
                minl[i + 1] = Math.min(minl[i], vals[i + 1]);
                maxl[i + 1] = Math.max(maxl[i], vals[i + 1]);
            }
            int[] minr = new int[n + 1];
            int[] maxr = new int[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                int d = 0;
                if (s.charAt(i) == '-') d--;
                else d++;
                minr[i] = Math.min(minr[i + 1] + d, 0);
                maxr[i] = Math.max(maxr[i + 1] + d, 0);
            }
            for (int i = 0; i < m; i++) {
                int l = sc.nextInt(), r = sc.nextInt();
                int mi = Math.min(minl[l - 1], vals[l - 1] + minr[r]);
                int ma = Math.max(maxl[l - 1], vals[l - 1] + maxr[r]);
                System.out.println(ma - mi + 1);
            }
        }
    }
}
