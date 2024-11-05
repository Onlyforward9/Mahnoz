package Codeforces;

import java.util.Scanner;

public class m1828b {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            int[] num = new int[n];
            for (int i = 0; i < n; i++) arr[num[i] = sc.nextInt()] = i+1;
            int p=0,j=0;
            while (j<n && num[j]==j+1)j++;
            p=num[j]-arr[num[j]];
            for (int i = 0; i < n; i++) {
                if (num[i]!=i+1) p = gcd(p, Math.abs(num[i]-arr[num[i]]));
            }
            System.out.println(p);
        }
    }
}
//1 3 1 4 9 6

//2-0-3-8-5
//2-1-6-
//3-8
//5
//