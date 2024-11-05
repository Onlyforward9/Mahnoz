package acmp;

import java.util.Scanner;

public class m322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int a = 1;
        int b = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 == a) {
                sb.append(s.charAt(i));
                int k = a;
                a += b;
                b = k;
            }
        }
        System.out.println(sb);
    }
}
