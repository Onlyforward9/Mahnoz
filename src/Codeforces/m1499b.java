package Codeforces;

import java.util.Scanner;

public class m1499b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int b = s.indexOf("11");
            int a = s.lastIndexOf("00");
            if (s.contains("00") && s.contains("11") && b < a)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

//01100