package Codeforces;

import java.util.Scanner;

public class m180c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String al = "qwertyuiopasdfghjklmnbvcxz";
        int  ku = 0, min = s.length(),pl=0,pu=0;
        for (int i=0;i<s.length();i++){
            if (!al.contains(s.charAt(i)+""))ku++;
        }
        for (int i=0;i<s.length();i++){
            min=Math.min(pl+(ku-pu),min);
            if (al.contains(s.charAt(i)+""))pl++;
            else pu++;
        }
        System.out.println(Math.min(min,s.length()-ku));
    }
}
