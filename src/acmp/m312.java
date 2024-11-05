package acmp;

import java.util.Scanner;

public class m312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        int c = b - a;
        while (n-- > 1) a += c;
        System.out.println(a);
    }
}
