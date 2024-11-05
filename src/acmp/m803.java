package acmp;

import java.util.Scanner;

public class m803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        while (k-- > 0) a = 10 * (a % b);
        System.out.println(a / b);
    }
}
