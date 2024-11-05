package acmp;

import java.util.Scanner;

public class m819 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long q1 = (a * b * c);
        long q2 = (a * b + a * c + b * c) * 2;
        System.out.println(q2 + " " + q1);
    }
}
