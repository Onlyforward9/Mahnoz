package acmp;

import java.util.Scanner;

public class m499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        if ((a1 + a2 <= k && b1 + b2 >= n) || (a2 + a3 <= k && b2 + b3 >= n) || (a1 + a3 <= k && b1 + b3 >= n) || (a1 <= k && b1 >= n) || (a2 <= k && b2 >= n) || (a3 <= k && b3 >= n) || (a1 + a2 + a3 <= k && b1 + b2 + b3 >= n)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
