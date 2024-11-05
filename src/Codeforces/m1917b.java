package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class m1917b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (!set.contains(s.charAt(i))) sum += n - i;
                set.add(s.charAt(i));
            }
            System.out.println(sum);
        }
    }
}
