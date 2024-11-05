package Codeforces;

import java.util.Scanner;

public class m2010a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = 0;
            for (int i = 0; i < n; i++)
                if (i % 2 == 0) s += sc.nextInt();
                else s -= sc.nextInt();
            System.out.println(s);
        }
    }
}
