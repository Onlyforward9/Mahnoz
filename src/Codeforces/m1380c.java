package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1380c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt(), k = 0;
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= x) k++;
                arr[i] = a;
            }
            Arrays.sort(arr);
            int l = 1, i = n - 1;
            while (i>=0 && arr[i] >= x) i--;
            for (; i >= 0; i--) {
                if (arr[i] * l < x) l++;
                else {
                    k++;
                    l = 1;
                }
            }
            System.out.println(k);
        }
    }
}
