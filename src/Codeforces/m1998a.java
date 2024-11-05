package Codeforces;

import java.util.Scanner;

public class m1998a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if (k % 2 == 0) {
                sb.append((x * k) + " " + (y * k) + "\n");
                sb.append("0 0\n");
                k-=2;
            }else {
                sb.append((x * k) + " " + (y * k) + "\n");
                k--;
            }
            for (int i = 1; i <= k; i++) {
                if (i % 2 == 1) sb.append((x * i) + " " + (y * i) + "\n");
                else sb.append((x * i * -1) + " " + (y * i * -1) + "\n");
            }
            System.out.println(sb);
        }
    }
}
