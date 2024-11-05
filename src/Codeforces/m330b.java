package Codeforces;

import java.util.Scanner;

public class m330b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), res = 0;
        int[] arr = new int[n];
        while (k-- > 0) {
            arr[sc.nextInt() - 1]++;
            arr[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < n; i++) if (arr[i] == 0) {res = i + 1;break;}
        System.out.println(n - 1);
        for (int i = 1; i <= n; i++) if (i != res) System.out.println(i + " "+res);
    }
}
