package Codeforces;

import java.util.Scanner;

public class m2009c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt();
            x -= Math.min(x, k);
            x = x % k == 0 ? x / k : x / k + 1;
            y = y % k ==  0 ? y / k : y / k + 1;
            System.out.println(Math.max(x, y) * 2);
        }
    }
}
