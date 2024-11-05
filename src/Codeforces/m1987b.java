package Codeforces;
import java.util.Scanner;
import java.util.TreeMap;

public class m1987b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int start = arr[0], p = 0;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 1; i < n; i++) {
                if (arr[i] < start) {
                    int l = start - arr[i];
                    if (map.containsKey(l)) map.put(l, map.get(l) + 1);
                    else map.put(l, 1);
                    p++;
                } else start = arr[i];
            }
            long res = 0, j = 0;
            for (int i : map.keySet()) {
                res += (p + 1) * (i - j);
                j+=(i-j);
                p -= map.get(i);
            }
            System.out.println(res);
        }
    }
}
