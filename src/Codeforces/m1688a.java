package Codeforces;

import java.util.Scanner;

public class m1688a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = 1;
            if (x == 1) System.out.println(3);
            else if (x % 2 == 1) System.out.println(1);
            else {
                int p = x;
                while (p % 2 == 0) p /= 2;
                if (p == 1) System.out.println(x + 1);
                else {
                    while ((x & k) == 0 || (x ^ k) == 0) k *= 2;
                    System.out.println(k);
                }
            }
        }
    }
}
//2 4 8 16 32
//6-2,12-4,24-8,48-16,96-32