package ITMO;

import java.util.Scanner;

public class Z_function5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append("0 ");
        for (int i = 1; i < s.length(); i++) {
            String a = s.substring(i);
            int k = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == s.charAt(j)) k++;
                else break;
            }
            sb.append(k+" ");
        }
        System.out.println(sb);
    }
}
