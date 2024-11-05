package acmp;

import java.util.Scanner;

public class m1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[15000];
        arr[1] = 1;
        for (int i = 3; i < arr.length / 2 + 1; i += 2) {
            for (int j = 2 * i; j < arr.length; j += i) {
                arr[j] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = a; i <= b; i++) {
            if (arr[i] == 0 && i % 2 != 0 || i == 2) {
                sb.append(i).append("\n");
                k++;
            }
        }
        System.out.println(k == 0 ? "Absent" : sb);
    }
}
