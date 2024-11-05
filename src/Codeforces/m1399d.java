package Codeforces;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class m1399d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 1;
            String s = sc.next();
            HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            map.put('1' - s.charAt(0), new TreeSet<>());
            map.get('1' - s.charAt(0)).add(1);
            map.put(s.charAt(0) - '0', new TreeSet<>());
            sb.append("1 ");
            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!map.get(ch - '0').isEmpty()) {
                    int f = map.get(ch - '0').first();
                    map.get('1' - ch).add(map.get(ch - '0').pollFirst());
                    sb.append(f + " ");
                } else {
                    sb.append((k + 1) + " ");
                    k++;
                    map.get('1' - ch).add(k);
                }
            }
            pw.println(k + "\n" + sb);
        }
        pw.close();
    }
}
