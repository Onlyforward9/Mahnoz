package acmp;

import java.util.Scanner;

public class m700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long v = sc.nextLong();
        long k = sc.nextLong();
        long j = k;
        long p = v;
        String str = "YES";
        for (int i = 1; i < n; i++) {
            if (v - j <= 0) str = "NO";
            else {
                p += (v - j);
            }
            j += k;
        }
        System.out.println(str + " " + p);
    }
}
