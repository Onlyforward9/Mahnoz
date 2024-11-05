package ITMO;

import java.util.HashMap;
import java.util.Scanner;

public class Z_function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j <= n; j++)
                    map.put(s.substring(i, j), map.getOrDefault(s.substring(i, j), 0) + 1);
            int k = 0;
            for (int i = 0; i < n; i++)
                if (!s.substring(0, i + 1).equals(s.substring(n - i - 1)))
                    k += map.get(s.substring(0, i + 1)) + map.get(s.substring(n - i - 1));
            System.out.println(k);
        }
    }
}
