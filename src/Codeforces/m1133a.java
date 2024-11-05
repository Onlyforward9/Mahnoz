package Codeforces;

import java.util.Scanner;

public class m1133a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int ah=Integer.parseInt(a.substring(0,2));
        int am=Integer.parseInt(a.substring(3));
        int bh=Integer.parseInt(b.substring(0,2));
        int bm=Integer.parseInt(b.substring(3));
        int dm=((bh-ah-1)*60+(bm+60-am))/2;
        am+=dm;
        ah+=(am/60);
        am=am%60;
        System.out.println(((ah<10?"0"+ah:ah)+":"+(am<10?"0"+am:am)));
    }
}
