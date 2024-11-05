package acmp;

import java.util.HashSet;
import java.util.Scanner;

public class m15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                if (s.equals("1")) {
                    String m = (String.valueOf(Math.max(i, j))) + (Math.min(i, j));
                    set.add(m);
                }
            }
        }
        System.out.println(set.size());
    }
}
