package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m1169b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<String> set = new TreeSet<>();
        while (m-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            set.add(Math.min(a, b) + " " + Math.max(a, b));
        }
        int a = 0, b = 0, c = 0, d = 0, l = 0;
        if (set.size() == 1) System.out.println("YES");
        else {
            String[] num = set.pollFirst().split(" ");
            int aa = Integer.parseInt(num[0]), bb = Integer.parseInt(num[1]);
            num = set.pollFirst().split(" ");
            int oo = Integer.parseInt(num[0]), uu = Integer.parseInt(num[1]);
            if (sol(aa, bb, set) || sol(aa, oo, set) || sol(aa, uu, set) || sol(bb, oo, set) || sol(bb, uu, set))
                System.out.println("YES");
            else {
                if (oo == aa || oo == bb) a = oo;
                else if (uu == aa || uu == bb) a = uu;
                else l = -1;
                if (l == -1) System.out.println("NO");
                else {
                    while (set.size() > 0) {
                        String s = set.pollFirst();
                        num = s.split(" ");
                        int ss = Integer.parseInt(num[0]), ee = Integer.parseInt(num[1]);
                        if (ss != a && ee != a) {
                            if (!s.equals(set.last())) {
                                b = ss;
                                c = ee;
                                break;
                            }
                        }
                    }
                    while (set.size() > 0) {
                        String s = set.pollFirst();
                        num = s.split(" ");
                        int ss = Integer.parseInt(num[0]), ee = Integer.parseInt(num[1]);
                        if (ss != a && ee != a) {
                            if (ss == b || ss == c) d = ss;
                            else if (ee == b || ee == c) d = ee;
                            else l = -1;
                            break;
                        }
                    }
                    if (l == -1) System.out.println("NO");
                    else {
                        while (set.size() > 0) {
                            num = set.pollFirst().split(" ");
                            int ss = Integer.parseInt(num[0]), ee = Integer.parseInt(num[1]);
                            if (ss != a && ss != d && ee != a && ee != d) {
                                l = -1;
                                break;
                            }
                        }
                        System.out.println(l == -1 ? "NO" : "YES");
                    }
                }
            }
        }
    }

    public static boolean sol(int a, int b, TreeSet<String> set) {
        boolean bol = true;
        for (String s : set) {
            String[] num = s.split(" ");
            int ss = Integer.parseInt(num[0]), ee = Integer.parseInt(num[1]);
            if (ss != a && ss != b && ee != a && ee != b) {
                bol = false;
                break;
            }
        }
        return bol;
    }
}
