package acmp;

import java.util.Scanner;

public class m25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a<b) System.out.println("<");
        else if (b<a) System.out.println(">");
        else System.out.println("=");
    }
}