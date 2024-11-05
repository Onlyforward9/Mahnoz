package Codeforces;

import java.util.Scanner;

public class m3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = "abcdefgh";
        int a = s.charAt(1) - '0';
        int h = p.indexOf(s.charAt(0) + "") + 1;
        String ss = sc.next();
        int aa = ss.charAt(1) - '0';
        int hh = p.indexOf(ss.charAt(0) + "") + 1;
        int k=0;
        StringBuilder sb=new StringBuilder();
        while (a!=aa || h!=hh) {
            String l = "";
            if (h > hh){
                l = "L";
                h--;
            }
            if (h < hh){
                l = "R";
                h++;
            }
            if (a > aa) {
                l += "D";
                a--;
            }
            if (a < aa){
                l += "U";
                a++;
            }
            k++;
            sb.append(l+"\n");
        }
        System.out.println(k+"\n"+sb);
    }
}
