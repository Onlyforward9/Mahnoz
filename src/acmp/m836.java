package acmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class m836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String s = Integer.toString(a, 8);
            if (a % 2 == 0 && (s.charAt(s.length() - 3) - '0') % 2 == 1)
                list.add(a);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i : list) System.out.print(i + " ");
    }
}
