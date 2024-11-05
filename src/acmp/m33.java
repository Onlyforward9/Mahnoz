package acmp;

import java.util.Scanner;

public class m33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(((a + b - 1) - a) + " " + ((a + b - 1) - b));
    }
}

