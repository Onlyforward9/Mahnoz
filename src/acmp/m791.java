package acmp;

import java.util.Scanner;

public class m791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 8 == 1) {
            if (n == 1) System.out.println("2 9");
            else if (n == 57) System.out.println("49 58");
            else System.out.println((n - 8) + " " + (n + 1) + " " + (n + 8));
        } else {
            String x = (n - 8) + " " + (n - 1) + " " + (n + 1) + " " + (n + 8);
            if (n % 8 == 2) {
                if (n == 2) System.out.println("1 3 10");
                else if (n == 58) System.out.println("50 57 59");
                else System.out.println(x);
            } else if (n % 8 == 3) {
                if (n == 3) System.out.println("2 4 11");
                else if (n == 59) System.out.println("51 58 60");
                else System.out.println(x);
            } else if (n % 8 == 4) {
                if (n == 4) System.out.println("3 5 12");
                else if (n == 60) System.out.println("52 59 61");
                else System.out.println(x);
            } else if (n % 8 == 5) {
                if (n == 5) System.out.println("4 6 13");
                else if (n == 61) System.out.println("53 60 62");
                else System.out.println(x);
            } else if (n % 8 == 6) {
                if (n == 6) System.out.println("5 7 14");
                else if (n == 62) System.out.println("54 61 63");
                else System.out.println(x);
            } else if (n % 8 == 7) {
                if (n == 7) System.out.println("6 8 15");
                else if (n == 63) System.out.println("55 62 64");
                else System.out.println(x);
            } else {
                if (n == 8) System.out.println("7 16");
                else if (n == 64) System.out.println("56 63");
                else System.out.println((n - 8) + " " + (n - 1) + " " + (n + 8));
            }
        }
    }
}
