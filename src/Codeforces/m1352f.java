package Codeforces;

import java.util.Scanner;

public class m1352f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n0 = sc.nextInt(), n1 = sc.nextInt(), n2 = sc.nextInt(), m = n1;
            StringBuilder sb = new StringBuilder();
            if (n0 == 0 && n1 == 0) sb.append("1".repeat(n2 + 1));
            else if (n0 == 0 && n2 == 0) {
                sb.append("10".repeat((n1 + 1) / 2));
                if (n1 % 2 == 0) sb.append("1");
            } else if (n2 == 0 && n1 == 0) sb.append("0".repeat(n0 + 1));
            else if (n0 == 0) {
                sb.append("1".repeat(n2 + 1));
                for (int i = 0; i < n1; i++) {
                    if (i % 2 == 0) sb.append("0");
                    else sb.append("1");
                }
            } else if (n2 == 0) {
                sb.append("0".repeat(n0 + 1));
                for (int i = 0; i < n1; i++) {
                    if (i % 2 == 0) sb.append("1");
                    else sb.append("0");
                }
            }else {
                sb.append("1".repeat(n2));
                for (int i = 0; i < n1; i++) {
                    if (i % 2 == 0) sb.append("1");
                    else sb.append("0");
                }
                if (n1%2==1)sb.append("0".repeat(n0+1));
                else {
                    sb.append("0".repeat(n0));
                    sb.append("1");
                }
            }
            System.out.println(sb);
        }
    }
}
//101000