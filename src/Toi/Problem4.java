package Toi;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, max = 0, start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int a = sc.nextInt();
            if (map.containsKey(a) && map.get(a) < start){
                map.put(a, j);
                s++;
            }
            else {
                if (!map.containsKey(a)) {
                    map.put(a, j);
                    s++;
                } else {
                    max = Math.max(max, s);
                    s = j - map.get(a);
                    start = map.get(a) + 1;
                    map.put(a, j);
                }
            }
            max = Math.max(max, s);
        }
        System.out.println(Math.max(max, s));
    }
}