package Codeforces;

import java.io.*;
import java.util.*;

public class m75b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] arr = br.readLine().split(" ");
            arr[0] = arr[0].replace("'s", "");
            int u;
            if (!Objects.equals(arr[1], "likes")) u = 3;
            else u = 2;
            arr[u] = arr[u].replace("'s", "");
            if (!arr[0].equals(name) && !arr[u].equals(name)) {
                if (!map.containsKey(arr[u])) map.put(arr[u], 0);
                if (!map.containsKey(arr[0])) map.put(arr[0], 0);
            } else {
                int sum;
                if (Objects.equals(arr[1], "posted")) sum = 15;
                else if (Objects.equals(arr[1], "commented")) sum = 10;
                else sum = 5;
                int p;
                if (arr[u].equals(name)) p = 0;
                else p = u;
                if (!map.containsKey(arr[p])) map.put(arr[p], sum);
                else map.put(arr[p], map.get(arr[p]) + sum);
            }
        }
        TreeMap<Integer, TreeSet<String>> list = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!list.containsKey(entry.getValue())) list.put(entry.getValue(), new TreeSet<>());
            list.get(entry.getValue()).add(entry.getKey());
        }
        ArrayDeque<String> result = new ArrayDeque<>();
        for (Map.Entry<Integer, TreeSet<String>> entry : list.entrySet()) {
            ArrayDeque<String> queue = new ArrayDeque<>();
            for (String str : entry.getValue()) queue.addFirst(str);
            for (String st : queue) result.addFirst(st);
        }
        StringBuilder sb = new StringBuilder();
        for (String r : result) sb.append(r + "\n");
        System.out.println(sb);
    }
}
