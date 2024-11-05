package Codeforces;

import java.util.Scanner;

public class m1175a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong(), p = 0;
            while (n != 0) {
                p += (n % k);
                n -= (n % k);
                if (n != 0) {
                    p++;
                    n /= k;
                }
            }
            System.out.println(p);
        }
    }
}
