package Codeforces;

import java.util.Scanner;

public class m1321a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0, m = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (arr[i] == 1 && b == 0) p++;
            else if (arr[i] == 0 && b == 1) m++;
        }
        if ((m > 0 && p == 0) || (m == 0 && p == 0)) System.out.println(-1);
        else System.out.println(m < p ? 1 : (m + 1) % p == 0 ? (m + 1) / p : (m + 1) / p + 1);
    }
}
//4-m , 5-n
//1 1 0 0 0 0 0 0
//0 0 1 1 1 1 1 1