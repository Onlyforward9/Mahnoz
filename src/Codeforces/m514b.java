package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m514b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble(), y = sc.nextDouble();
        HashSet<Double> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            double aa = a - x, bb = b - y;
            if (aa == 0) set.add((double) 0);
            else if (bb == 0) set.add((double) Integer.MAX_VALUE);
            else set.add(aa / bb);
        }
        System.out.println(set.size());
    }
}
