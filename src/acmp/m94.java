package acmp;

import java.util.Scanner;

public class m94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = a - c;
        int k = 1;
        if (a >= b) System.out.println(1);
        else if (a > c) {
            while (b > a) {
                b -= p;
                k++;
            }
            System.out.println(k);
        } else System.out.println("NO");
    }
}
