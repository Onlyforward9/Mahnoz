package Codeforces;

import java.util.Scanner;

public class m235a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        if (s == 1) System.out.println(1);
        else if (s == 2) System.out.println(2);
        else if (s == 6) System.out.println(60);
        else {
            if (s % 2 == 0) System.out.println(s * (s - 1) * (s - 3));
            else System.out.println(s * (s - 1) * (s - 2));
        }
    }
}
