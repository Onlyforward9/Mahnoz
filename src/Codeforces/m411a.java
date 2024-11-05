package Codeforces;

import java.util.Scanner;

public class m411a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String al = "qwertyuioplkjhgfdsazxcvbnm";
        String alU = al.toUpperCase();
        String num = "0123456789";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (al.contains(s.charAt(i) + "")) {
                k++;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (alU.contains(s.charAt(i) + "")) {
                k++;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (num.contains(s.charAt(i) + "")) {
                k++;
                break;
            }
        }
        System.out.println(s.length() >= 5 && k == 3 ? "Correct" : "Too weak");
    }
}
