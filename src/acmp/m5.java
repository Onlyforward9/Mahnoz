package acmp;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class m5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        ArrayList<Integer> list_t = new ArrayList<>();
        ArrayList<Integer> list_j = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) list_j.add(a);
            else list_t.add(a);
        }
        for (Integer integer : list_t) {
            pw.print(integer + " ");
        }
        pw.println();
        for (Integer integer : list_j) {
            pw.print(integer + " ");
        }
        pw.println();
        pw.println(list_j.size() >= list_t.size() ? "YES" : "NO");
        pw.close();
    }
}
