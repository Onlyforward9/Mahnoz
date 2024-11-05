package acmp;

import java.util.Scanner;

public class m333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), c = sc.next(), res = "";
        int k = 0;
        for (int i = 0; i <= 9; i++) {
            if (a.contains(i + "") && b.contains(i + "") && c.contains(i + "")) {
                res += i + " ";
                k++;
            }
        }
        System.out.println(k);
        System.out.println(res);
    }
}
