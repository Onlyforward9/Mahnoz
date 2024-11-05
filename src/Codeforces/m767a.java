package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class m767a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = n; i >= 1; i--) set.add(i);
        int max = n, min = n;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            set.remove(a);
            while (!set.contains(max) && max>0){
                sb.append(max+" ");
                max--;
            }
            pw.println(sb);
        }
        pw.close();
    }
}
