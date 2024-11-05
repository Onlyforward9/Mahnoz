package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class m1638b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                if (l % 2 == 0) a.add(l);
                else b.add(l);
            }
            System.out.println((a.isEmpty() || sol(a)) && (b.isEmpty() || sol(b)) ? "YES" : "NO");
        }
    }

    public static boolean sol(ArrayList<Integer> list) {
        int s = list.get(0);
        for (int i : list) {
            if (s > i) return false;
            s = i;
        }
        return true;
    }
}
//1 2 3 2 5 6 7 3