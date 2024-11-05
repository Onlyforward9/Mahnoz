package Codeforces;

import java.util.Objects;
import java.util.Scanner;

public class m1780a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String aa = "", bb = "";
            int k_tok_A = 0, k_juft_A = 0, k_tok_B = 0;
            for (int i = 1; i <= n; i++) {
                int l = sc.nextInt();
                if (l % 2 == 0) {
                    k_juft_A++;
                    aa += k_juft_A < 3 ? "" + i + " " : "";
                } else {
                    aa += k_tok_A == 0 ? "" + i + " " : "";
                    bb += k_tok_B < 3 ? "" + i + " " : "";
                    k_tok_A++;
                    k_tok_B++;
                }
            }
            if (k_tok_A > 0 && k_juft_A > 1) System.out.println("YES\n" + aa);
            else if (k_tok_B > 2) System.out.println("YES\n" + bb);
            else System.out.println("NO");
        }
    }
}
