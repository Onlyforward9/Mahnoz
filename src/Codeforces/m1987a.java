package Codeforces;

import java.util.Scanner;

public class m1987a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            System.out.println(n*k-(k-1));
        }
    }
}
