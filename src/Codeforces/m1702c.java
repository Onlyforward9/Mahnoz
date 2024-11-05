package Codeforces;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class m1702c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            HashMap<Integer, int[]> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (!map.containsKey(a)) {
                    map.put(a, new int[2]);
                    map.get(a)[0] = -1;
                }
                map.get(a)[0] = map.get(a)[0] != -1 ? map.get(a)[0] : i;
                map.get(a)[1] = i;
            }
            for (int i = 0; i < q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (!map.containsKey(a) || !map.containsKey(b)) pw.println("NO");
                else {
                    if (map.get(a)[0] > map.get(b)[1]) pw.println("NO");
                    else pw.println("YES");
                }
            }
        }
        pw.close();
    }
}
