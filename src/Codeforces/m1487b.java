package Codeforces;

import java.util.Scanner;

public class m1487b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong(), m = n;
            if (n % 2 == 1) {
                n = (n + 1) / 2;
                if (k < n){
                    System.out.println(k);
                    continue;
                }
                else {
                    k += (k - n) / (n - 1) + 1;
                }
            }
            k %= m;
            System.out.println(k == 0 ? m : k);
        }
    }
}
