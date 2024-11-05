package acmp;

import java.util.Scanner;

public class m933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long t = sc.nextLong();
        if (t <= a) System.out.println(t * b);
        else System.out.println((a * b) + (t - a) * c);
    }
}