package Codeforces;

import java.util.Objects;
import java.util.Scanner;

public class m1954b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n+1];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = 0, min = n;
            arr[n]=0;
            for (int i = 0; i <= n; i++) {
                if (Objects.equals(arr[i], arr[0])) k++;
                else {
                    min = Math.min(min, k);
                    k = 0;
                }
            }
            System.out.println(min == n ? -1 : Math.max(min,1));
        }
    }
}
