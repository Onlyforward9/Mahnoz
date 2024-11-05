package Codeforces;

import java.util.Scanner;

public class m1928a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 2 == 0 && b % 2 == 0) System.out.println("Yes");
            else if ((a % 2 == 0 && a / 2 == b) || (b % 2 == 0 && b / 2 == a)) System.out.println("No");
            else if (a % 2 == 1 && b % 2 == 1) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
