package Codeforces;

import java.util.Scanner;

public class m231a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (s >= 2) k++;
        }
        System.out.println(k);
    }
}
