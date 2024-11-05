package Codeforces;

import java.util.Scanner;

public class m1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (t-- > 0) {
            String s = sc.next();
            if ((s.charAt(0) == 'R') && !a.contains(s.substring(1, 2)) && s.contains("C")) {
                int index = s.indexOf("C");
                String A = s.substring(1, index);
                int B = Integer.parseInt(s.substring(index + 1));
                String sb = "";
                while (B > 0) {
                    if (B % 26 == 0) {
                        B -= 1;
                        sb = "Z" + sb;
                    } else sb = a.charAt(B % 26 - 1) + sb;
                    B /= 26;
                }
                System.out.println(sb + A);
            } else {
                String B = "";
                int index = 0;
                while (a.contains(s.substring(index, index + 1))) {
                    B += s.substring(index, index + 1);
                    index++;
                }
                int SB = 0;
                for (int i = 0; i < B.length(); i++) {
                    SB += ((a.indexOf(B.substring(i, i + 1)) + 1) * Math.pow(26, (B.length() - i - 1)));
                }
                System.out.println("R" + (s.substring(index)) + "C" + SB);
            }
        }
    }
}
