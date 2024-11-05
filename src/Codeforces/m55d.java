package Codeforces;

import java.util.Scanner;

public class m55d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=0;
        for (int i = 1; i <= 1000; i++) {
            int k = i;
            boolean b = true;
            while (k > 0) {
                int p = k % 10;
                if (p!=0 && i % p != 0) {
                    b = false;
                    break;
                }
                k /= 10;
            }
            if (b) {
                System.out.println(i);
                r++;
            }
        }
        System.out.println(r);
    }
}
