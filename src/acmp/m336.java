package acmp;

import java.util.HashSet;
import java.util.Scanner;

public class m336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Integer> set = new HashSet<>();
        int k = 1;
        set.add(1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') k += 1;
            else k -= 1;
            set.add(k);
        }
        System.out.println(set.size());
    }
}
