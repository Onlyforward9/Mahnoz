package Codeforces;

import java.util.*;

public class m769b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0, p = 0;
        int[] arr = new int[n], num = new int[n];
        for (int i = 0; i < n; i++) k += num[i] = arr[i] = sc.nextInt();
        if (k < n - 1 || arr[0] == 0) System.out.println(-1);
        else {
            num[0] = 0;
            Arrays.sort(num);
            System.out.println(n - 1);
            ArrayList<Integer> list = new ArrayList<>();
            int m = n - 1, o = 1, l = arr[0], g = 0;
            while (list.size() != n - 1) {
                for (int j = 1; j < n; j++) {
                    if (arr[j] == num[m] && !list.contains(j)) {
                        System.out.println(o + " " + (j + 1));
                        list.add(j);
                        m--;
                        l--;
                        if (l == 0) {
                            o = list.get(g) + 1;
                            l = arr[list.get(g)];
                            g++;
                        }
                        break;
                    }
                }
            }
        }
    }
}
