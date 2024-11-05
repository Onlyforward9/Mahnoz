package Codeforces;

import java.util.Scanner;

public class m122b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (!s.contains("7") && !s.contains("4")) System.out.println(-1);
        else {
            int l = s.length() - s.replace("7", "").length();
            int p = s.length() - l;
            System.out.println(l > p ? 4 : 7);
        }
    }
}
