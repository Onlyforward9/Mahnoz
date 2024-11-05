package Codeforces;

import java.util.Scanner;

public class m1269a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "4 " + (n + 4) : "9 " + (n + 9));
    }
}
