package acmp;

import java.util.Scanner;

public class m943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = ((x - 1) * m) - 1;
        int k = x % 2 == 0 ? (m - y + 1) : y;
        System.out.println(p + k);
    }
}
