package Codeforces;

import java.util.Scanner;

public class m1669d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = s.substring(0, 1);
            int p = 0;
            for (int i = 1; i < s.length(); i++) {
                if (!s.substring(i, i + 1).equals(r.substring(p, p + 1))) {
                    r += s.substring(i, i + 1);
                    p++;
                }
            }
            String[] arr = r.split("W");
            String res = "YES";
            for (String st : arr) {
                if (st.equals("R") || st.equals("B")) {
                    res = "NO";
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
