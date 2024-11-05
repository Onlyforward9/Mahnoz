package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1703d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                set.add(s);
                arr[i] = s;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int b = 0;
                for (int j = 0; j < arr[i].length(); j++) {
                    if (set.contains(arr[i].substring(0, j)) && set.contains(arr[i].substring(j))) {
                        b = 1;
                        break;
                    }
                }
                sb.append(b);
            }
            System.out.println(sb);
        }
    }
}
