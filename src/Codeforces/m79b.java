package Codeforces;

import java.util.*;

public class m79b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k, t;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        t = sc.nextInt();
        long[] arr = new long[1005];
        for (int i = 0; i < k; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i] = (long) m * (a - 1) + b;
        }
        Arrays.sort(arr, 0, k);
        for (int i = 0; i < t; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            long pos = (long) m * (a - 1) + b;
            int tp = 0;
            while (pos > arr[tp] && tp < k) tp++;
                if (arr[tp] == pos)
                System.out.println("Waste");
            else {
                long ans = pos - tp;
                if (ans % 3 == 0)
                    System.out.println("Grapes");
                else if (ans % 3 == 1)
                    System.out.println("Carrots");
                else
                    System.out.println("Kiwis");
            }
        }
    }
}
