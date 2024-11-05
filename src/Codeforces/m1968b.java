package Codeforces;

import java.util.Scanner;

public class m1968b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(close10(sc.nextInt(), sc.nextInt()));
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt(), m = sc.nextInt();
//            String a = sc.next(), b = sc.next();
//            int max = 0, j = 0;
//            for (int i = 0; i < n; i++) {
//                char ch = a.charAt(i);
//                int k=0;
//                for (; j < m ; j++) {
//                    if (b.charAt(j) == ch) {
//                        k=1;
//                        j++;
//                        break;
//                    }
//                }
//                if (k == 1)max = i + 1;
//                else break;
//            }
//            System.out.println(max);
//        }
    }

    public static int close10(int a, int b) {
        int aa = Math.abs(a - 10);
        int bb = Math.abs(b - 10);
        if (aa == bb) return 0;
        return aa < bb ? a : aa > bb ? b : 0;
    }


}
