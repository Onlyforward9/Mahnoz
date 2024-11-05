package acmp;

import java.util.ArrayList;
import java.util.Scanner;

public class m79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int p = a;
        do {
            list.add(p);
            p *= a;
            p %= 10;
        } while (p != a);
        System.out.println(list.get(b % list.size() -1));
    }
}
