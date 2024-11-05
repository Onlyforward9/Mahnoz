package Codeforces;

import java.util.Scanner;

public class m1862d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = -1 + (long) Math.sqrt(4 * (n * 2) + 1) / 2;
            n -= (k * (k + 1) / 2);
            k++;
            while (n - k >= 0) {
                n -= k;
                k++;
            }
            System.out.println(k + n);
        }
    }
}
//(n+1)*n=k*2


//1 2 3 4 5 6 7 8
//1 2-2
//1 2 3-3
//1 2 3 4-6
//1 2 3 4 5-10
//1 2 3 4 5 6-15

