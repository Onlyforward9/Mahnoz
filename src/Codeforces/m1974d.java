package Codeforces;

import java.util.Scanner;

public class m1974d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), u = 0, d = 0, l = 0, r = 0;
            String s = sc.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'N') u++;
                else if (s.charAt(i) == 'S') d++;
                else if (s.charAt(i) == 'E') r++;
                else l++;
            }
            if ((l + r) % 2 == 0 && (u + d) % 2 == 0) {
                int[] arr = new int[n];
                String[] num = {"R", "H"};
                d = u = 0;
                l = r = 1;
                for (int i = 0; i < n; i++)
                    if (s.charAt(i) == 'S') arr[i] = d++ % 2;
                for (int i = 0; i < n; i++)
                    if (s.charAt(i) == 'N') arr[i] = u++ % 2;
                for (int i = 0; i < n; i++)
                    if (s.charAt(i) == 'W') arr[i] = l++ % 2;
                for (int i = 0; i < n; i++)
                    if (s.charAt(i) == 'E') arr[i] = r++ % 2;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) sb.append(num[arr[i]]);
                String m = String.valueOf(sb);
                System.out.println(m.contains("H") && m.contains("R") ? sb : "NO");
            } else System.out.println("NO");
        }
    }
}
