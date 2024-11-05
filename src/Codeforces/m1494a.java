package Codeforces;

import java.util.Scanner;

public class m1494a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String[] arr = ar(s);
            s = s.replace(arr[0], "(");
            boolean a = bol(s.replace(arr[1], "(").replace(arr[2], ")"));
            boolean b = bol(s.replace(arr[1], ")").replace(arr[2], "("));
            boolean c = bol(s.replace(arr[1], "(").replace(arr[2], "("));
            boolean d = bol(s.replace(arr[1], ")").replace(arr[2], ")"));
            System.out.println(a || b || c || d ? "YES" : "NO");
        }
    }

    public static String[] ar(String s) {
        String[] arr = new String[3];
        if (s.charAt(0) == 'A') {
            arr[0] = "A";
            arr[1] = "B";
            arr[2] = "C";
        } else if (s.charAt(0) == 'B') {
            arr[0] = "B";
            arr[1] = "A";
            arr[2] = "C";
        } else {
            arr[0] = "C";
            arr[1] = "A";
            arr[2] = "B";
        }
        return arr;
    }

    public static boolean bol(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') k++;
            else k--;
            if (k < 0) return false;
        }
        return k == 0;
    }
}
