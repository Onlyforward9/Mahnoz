package Codeforces;

import java.util.Scanner;

public class m793b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = x; i > y; i--) sb.append(i + " ");
            for (int i = y; i < x; i++) sb.append(i + " ");
            System.out.println(((x - y) * 2) + "\n" + sb);
        }
    }
}
