package Codeforces;

import java.util.*;

public class m1987d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 0, p = 0;
            int[] arr = new int[n];
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
                else map.put(arr[i], 1);
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int pol = 0;
            for (int i : map.keySet()) queue.add(map.get(i));
            for (int i : map.keySet()) {
                if (queue.size()!=0 && p>=queue.peek()){
                    p-=queue.poll();
                    pol++;
                }else {
                    p++;
                    queue.remove(map.get(i));
                }
            }
            System.out.println(map.size()-pol);
        }
    }
}
