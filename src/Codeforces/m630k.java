package Codeforces;

import java.util.Scanner;

public class m630k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = 0;
            for (long i = 1; i <= n; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
                    k++;
            }
            System.out.print(k + " ");
        }
        int[] arr= {
            1, 5, 7, 9, 12, 14, 16, 19, 21, 22, 26, 27, 29, 32, 34, 36, 39, 41, 43, 47, 48, 49, 53, 55, 57, 60, 62, 64, 67, 69, 70, 74, 75, 77, 80, 82, 84, 87, 89, 91
        };
        for(int i=1;i<arr.length;i++) System.out.print((arr[i]-arr[i-1])+" ");
    }
}
