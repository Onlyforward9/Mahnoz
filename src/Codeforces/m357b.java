package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class m357b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            String st = "123";
            if (map.containsKey(a)) {
                st = st.replace(map.get(a) + "", "");
                map.put(b, st.charAt(0) - '0');
                map.put(c, st.charAt(1) - '0');
            } else if (map.containsKey(b)) {
                st = st.replace(map.get(b) + "", "");
                map.put(a, st.charAt(0) - '0');
                map.put(c, st.charAt(1) - '0');
            } else if (map.containsKey(c)) {
                st = st.replace(map.get(c) + "", "");
                map.put(b, st.charAt(0) - '0');
                map.put(a, st.charAt(1) - '0');
            } else {
                map.put(a, 1);
                map.put(b, 2);
                map.put(c, 3);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=n;i++)sb.append(map.getOrDefault(i, 1)+" ");
        System.out.println(sb);
    }
}
