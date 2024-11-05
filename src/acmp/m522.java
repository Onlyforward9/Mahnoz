package acmp;

import java.util.*;

public class m522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        while (n-- > 0) set1.add(sc.nextInt());
        while (m-- > 0) set2.add(sc.nextInt());
        boolean bol = true;
        for (int i : set1) {if (!set2.contains(i)) {bol = false;break;}}
        System.out.println(set1.size() == set2.size() && bol ? 1 : 0);
    }
}
