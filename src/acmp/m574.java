package acmp;

import java.util.Scanner;

public class m574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] a = new int[26], b = new int[26];
        String aa = sc.next(), bb = sc.next();
        for (int i = 0; i < aa.length(); i++) a[s.indexOf(aa.charAt(i) + "")]++;
        for (int i = 0; i < bb.length(); i++) b[s.indexOf(bb.charAt(i) + "")]++;
        for (int i=0;i<26;i++){
            if (a[i]!=b[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
