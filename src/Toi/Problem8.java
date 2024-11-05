package Toi;

import java.util.HashSet;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(sc.nextInt());
        System.out.println(Math.max(set.size()-k,0));
    }
}
