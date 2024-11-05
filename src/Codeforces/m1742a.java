package Codeforces;

import java.util.Scanner;

public class m1742a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            System.out.println(a == b + c || b == a + c || c == a + b ? "YES" : "NO");
        }
    }
}
