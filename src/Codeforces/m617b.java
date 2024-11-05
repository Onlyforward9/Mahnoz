package Codeforces;

import java.util.Scanner;

public class m617b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        int l = 0;
        int p = -1;
        while (n-- > 0) {
            int a = sc.nextInt();
            if (a == 1) {
                p = 1;
                break;
            }
        }
        while (n-- > 0) {
            int a = sc.nextInt();
            if (a == 1) {
                s *= (l + 1);
                l = 0;
            } else l++;
        }
        System.out.println(p == 1 ? s : 0);
    }
}
