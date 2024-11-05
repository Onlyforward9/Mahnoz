package Codeforces;

import java.util.Scanner;

public class m1534c {
    static int[] visit;
    static int[] arr;
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            arr = new int[n + 1];
            for (int i = 0; i < n; i++) ar[i] = sc.nextInt();
            for (int i = 0; i < n; i++) arr[ar[i]] = sc.nextInt();
            visit = new int[n + 1];
            int comp = 1;
            for (int i = 1; i <= n; i++) {
                if (visit[i] == 0) {
                    int a = i;
                    do {
                        a = arr[a];
                        visit[a] = comp;
                    } while (a != i);
                    comp++;
                }
            }
            long res = 1;
            while (comp-- > 1) {
                res = (res * 2 + mod) % mod;
            }
            System.out.println(res);
        }
    }
}
