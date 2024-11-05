package Codeforces;

import java.util.Scanner;

public class m1584b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), m = sc.nextLong();
            long s = n * m;
            s = s % 3 == 0 ? s / 3 : s / 3 + 1;
            System.out.println(s);
        }
    }
}
