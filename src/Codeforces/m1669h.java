package Codeforces;

import java.util.Scanner;

public class m1669h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 1; i <= 20; i++) {
                for (int j = 0; j < 15; j++) System.out.print((i | (int) Math.pow(2, j))+" ");
                System.out.println();
            }
        }
    }
}
