package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m75c {
    public static int gc(int a, int b) {
        if (b == 0) return a;
        int r = a % b;
        return gc(b, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gc(a, b);
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i * i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                set.add(i);
                set.add(gcd / i);
            }
        }
        StringBuilder sb=new StringBuilder();
        int q = sc.nextInt(),last=set.last();
        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt(),res;
            if (l<=last) {
                res = set.floor(r);
                if (res >=l) sb.append(res+"\n");
                else sb.append("-1\n");
            }else sb.append("-1\n");
        }
        System.out.println(sb);
    }
}
