package Codeforces;

import java.util.Scanner;

public class m1536a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "YES";
            for (int i = 0; i < n; i++) if (sc.nextInt() < 0) s = "NO";
            if (s=="NO") System.out.println(s);
            else {
                System.out.println(s+"\n101");
                for (int i=0;i<=100;i++) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
