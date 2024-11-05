package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class m45i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k0 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 0) list.add(a);
            else if (a > 0) sb.append(a + " ");
            else k0++;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size() - list.size() % 2; i++) sb.append(list.get(i) + " ");
        if (sb.length() == 0) {
            if (k0 > 0) System.out.println(0);
            else System.out.println(list.get(0));
        } else System.out.println(sb);
    }
}
