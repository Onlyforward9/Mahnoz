package Codeforces;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class m1133d {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        Map<String, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int g = gcd(arr[i], b);
            if (arr[i] != 0) {
                b /= g;
                arr[i] /= g;
                if (map.containsKey(arr[i] + " " + b)) map.put(arr[i] + " " + b, map.get(arr[i] + " " + b) + 1);
                else map.put(arr[i] + " " + b, 1);
            } else map.put(arr[i] + " ", 0);
            if (arr[i]==0 && b == 0) k++;
        }
        System.out.println(Collections.max(map.values())+k);
    }
}
