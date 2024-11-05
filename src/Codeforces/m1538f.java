package Codeforces;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class m1538f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = r - l;
            while (l != r && l % 10 != 9) l++;
            while (l < r) {
                int p = 1;
                while ((l / p) % 10 == 9) {
                    k++;
                    p *= 10;
                }
                l += 10;
            }
            System.out.println(k);
        }
    }
}