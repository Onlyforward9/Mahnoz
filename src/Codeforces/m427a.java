package Codeforces;

import java.util.Scanner;

public class m427a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0, r = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a != -1) k += a;
            else {
                if (k==0)r++;
                else k--;
            }
        }
        System.out.println(r);
    }
}
