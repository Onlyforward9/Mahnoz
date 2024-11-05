package Codeforces;

import java.util.Scanner;

public class m1981a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            int p = 1;
            while ((int) Math.pow(2, p) <= r) p++;
            System.out.println(p - 1);
        }
    }
}
//5 17
//17-17
//16-
//8 16
