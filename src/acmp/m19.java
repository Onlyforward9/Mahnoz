package acmp;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class m19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        String a3 = sc.next();
        a1 = string(a1);
        a2 = string(a2);
        a3 = string(a3);
        int k = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                String p = valueOf(j) + i;
                if (!p.equals(a1) && !p.equals(a2) && !p.equals(a3)) {
                    if (f1(a1, j, i) || f2(a2, j, i) || f3(a3, j, i)) k++;
                }
            }
        }
        System.out.println(k);

    }

    public static String string(String s) {
        s = s.replace("A", "1");
        s = s.replace("B", "2");
        s = s.replace("C", "3");
        s = s.replace("D", "4");
        s = s.replace("E", "5");
        s = s.replace("F", "6");
        s = s.replace("G", "7");
        s = s.replace("H", "8");
        return s;
    }

    public static boolean f1(String a, int jj, int ii) {
        int i = Math.abs(Integer.parseInt(a.substring(0, 1)) - jj);
        int j = Math.abs(Integer.parseInt(a.substring(1, 2)) - ii);
        if (i == 0 && j == 0) return false;
        else return ((i == 0 || j == 0) || i == j);
    }

    public static boolean f2(String a, int jj, int ii) {
        int i = Math.abs(Integer.parseInt(a.substring(0, 1)) - jj);
        int j = Math.abs(Integer.parseInt(a.substring(1, 2)) - ii);
        if (i == 0 && j == 0) return false;
        else return i == 0 || j == 0;
    }

    public static boolean f3(String a, int jj, int ii) {
        int i = Math.abs(Integer.parseInt(a.substring(0, 1)) - jj);
        int j = Math.abs(Integer.parseInt(a.substring(1, 2)) - ii);
        if (i == 0 && j == 0) return false;
        else return (i == 1 && j == 2) || (i == 2 && j == 1);
    }
}
