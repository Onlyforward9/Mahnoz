package Codeforces;

import java.util.Scanner;

public class m1954a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int p = n % m == 0 ? n / m : n / m + 1;
            System.out.println(n == 1 || n - p <= k ? "NO" : "YES");
        }
    }
}
