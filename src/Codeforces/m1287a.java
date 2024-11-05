package Codeforces;

import java.util.Scanner;

public class m1287a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int k = 0;
            while (s.contains("AP")) {
                s = s.replace("AP", "AA");
                k++;
            }
            System.out.println(k);
        }
    }
}
