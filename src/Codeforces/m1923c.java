package Codeforces;

import java.util.Scanner;

public class m1923c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            long[] arr = new long[n + 1];
            long[] sum = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                arr[i] = arr[i - 1];
                sum[i] = sum[i - 1];
                if (a == 1) arr[i]++;
                sum[i]+=a;
            }
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt(), r = sc.nextInt();
                long p=((sum[r] - sum[l - 1])-(arr[r] - arr[l - 1]*2));
                if (l != r && (r-l-(arr[r] - arr[l - 1])+1)>0 && p/(r-l-(arr[r] - arr[l - 1])+1)>=1)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
