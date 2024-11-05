package acmp;

import java.util.ArrayList;
import java.util.Scanner;

public class m98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        long a = 0;
        long b = 0;
        int i = 0;
        while (!list.isEmpty()) {
            if (i % 2 == 0) {
                if (list.get(list.size() - 1) > list.get(0)) {
                    a += list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                } else {
                    a += list.get(0);
                    list.remove(0);
                }
            } else {
                if (list.get(list.size() - 1) > list.get(0)) {
                    b += list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                } else {
                    b += list.get(0);
                    list.remove(0);
                }
            }
            i++;
        }
        System.out.println(a + ":" + b);
    }
}
