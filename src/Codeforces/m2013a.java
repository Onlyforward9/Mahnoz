package Codeforces;

import java.util.Scanner;

public class m2013a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int min = Math.min(x, y);
            min = n % min == 0 ? n / min : n / min + 1;
            System.out.println(min);
        }
    }
}
