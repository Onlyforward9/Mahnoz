package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class m1433d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                if (!set.contains(a)) {
                    list.add(i);
                    set.add(a);
                }
            }
            System.out.println(list);
        }
    }
}
