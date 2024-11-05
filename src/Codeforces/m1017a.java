package Codeforces;

import java.util.Scanner;

public class m1017a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int a = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        for (int i = 1; i < n; i++) {
            int s = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (s > a) k++;
        }
        System.out.println(k+1);
    }
}
