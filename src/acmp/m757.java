package acmp;

import java.util.Scanner;

public class m757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long c = sc.nextLong() / 2;
        long h = sc.nextLong() / 6;
        long o = sc.nextLong();
        System.out.println(Math.min(c, Math.min(h, o)));
    }
}
