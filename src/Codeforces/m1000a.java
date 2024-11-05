package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class m1000a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.next());
        for (int i = 0; i < n; i++) list.remove(sc.next());
        System.out.println(list.size());
    }
}
