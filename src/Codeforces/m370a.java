package Codeforces;

import java.util.Scanner;
public class m370a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int aa = Math.abs(a - x), bb = Math.abs(b - y);
        System.out.print(a == x || b == y ? "1 " : "2 ");
        System.out.println(aa == bb ? "1 " : aa % 2 == bb % 2 ? "2 " : "0 ");
        System.out.println(Math.max(aa, bb));
    }
}
