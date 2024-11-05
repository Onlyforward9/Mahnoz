package acmp;

import java.util.Scanner;

public class m948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = k % n == 0 ? k / n : k / n + 1;
        System.out.println(a + " " + (k % n == 0 ? n : k % n));
    }
}
