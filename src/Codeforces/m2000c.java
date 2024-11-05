package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class m2000c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int m = sc.nextInt();
            while (m-- > 0) {
                String a = sc.next();
                String res = "YES";
                Map<Character, Integer> map = new HashMap<>();
                Map<Integer, Integer> list = new HashMap<>();
                if (a.length() != n) System.out.println("NO");
                else {
                    for (int i = 0; i < a.length(); i++) {
                        if (map.containsKey(a.charAt(i))) {
                            if (arr[i] != arr[map.get(a.charAt(i))]) {
                                res = "NO";
                                break;
                            }
                        } else map.put(a.charAt(i), i);
                        if (list.containsKey(arr[i])) {
                            if (a.charAt(i) != a.charAt(list.get(arr[i]))) {
                                res = "NO";
                                break;
                            }
                        } else list.put(arr[i], i);
                    }
                    System.out.println(res);
                }
            }
        }
    }
}
