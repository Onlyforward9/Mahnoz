package acmp;

import java.util.Scanner;

public class m949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong(), b = sc.nextLong();
        while (n-- > 1) {
            long c = a;
            a = b - a;
            b = c;
        }
        System.out.println(a + " " + b);
    }
}
