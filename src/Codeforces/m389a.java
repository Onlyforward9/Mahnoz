package Codeforces;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class m389a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        while (!Objects.equals(arr[0], arr[n-1])) {
            int i=1;
            while (Objects.equals(arr[i], arr[0]))i++;
            arr[i]-=arr[0];
            Arrays.sort(arr);
        }
        for (int i : arr) s += i;
        System.out.println(s);
    }
}
