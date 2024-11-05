package Codeforces;

import java.util.Scanner;

public class m1758c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if (n % x != 0) System.out.println(-1);
            else {
                int[] arr = new int[n + 1];
                int p = x;
                while (p != n) {
                    int st = n;
                    for (int i = 2; i <= n; i++) {
                        if (n % (i * p) == 0) {
                            st = i * p;
                            break;
                        }
                    }
                    arr[p] = st;
                    p = st;
                }
                sb.append(x + " ");
                for (int i = 2; i < n; i++) {
                    sb.append(arr[i] == 0 ? i + " " : (arr[i] + " "));
                }
                System.out.println(sb + "1");
            }
        }
    }
}