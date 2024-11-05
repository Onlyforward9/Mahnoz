package Codeforces;

import java.util.*;

public class m274a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int a:arr) if (a % k != 0 || !set.contains(a/k)) set.add(a);
        System.out.println(set.size());
    }
}
