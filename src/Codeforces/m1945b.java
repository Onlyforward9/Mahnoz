package Codeforces;

import java.util.Scanner;

public class m1945b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(), m = sc.nextLong();
            System.out.println((m / a) + (m / b) + 2);
        }
    }
}
