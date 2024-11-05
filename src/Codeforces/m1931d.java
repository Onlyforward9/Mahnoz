package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class m1931d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            Integer[] num = new Integer[n];
            Integer[] ar = new Integer[n];
            HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (!map.containsKey(a % x)) map.put(a % x, new LinkedList<>());
                map.get(a % x).add(i);
                num[i] = a;
                ar[i] = a % x;
            }
            int k = 0;
            for (int i = 0; i < ar.length; i++) {
                int l = ar[i] == 0 ? 0 : x - ar[i];
                if (map.containsKey(l)) {
                    LinkedList<Integer> list_p = new LinkedList<>(map.get(l));
                    for (int j = l == ar[i] ? 1 : 0; j < list_p.size(); j++) {
                        if (((num[i] - num[list_p.get(j)]) % y == 0)) k++;
                    }
                }
                map.get(ar[i]).removeFirst();
            }
            pw.println(k);
        }
        pw.close();
    }
}
