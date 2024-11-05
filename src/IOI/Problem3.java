package IOI;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), m = sc.nextLong();
        long[][] arr = new long[(int) m][(int) m];
        HashMap<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), t = sc.nextInt();
            arr[x - 1][y - 1] = 1;
            map.put(new int[]{x, y}, t);
        }
        int time = 1;
        while (solve(arr, m)) {
            for (Map.Entry<int[], Integer> entry : map.entrySet()) {
                if (entry.getValue() <= time) {
                    int x = entry.getKey()[0], y = entry.getKey()[1], t = entry.getValue();
                    int tm = time - t + 1;
                    for (int i = Math.max(0, y - tm); i < Math.min(m, y + tm - 1) && x - tm >= 0; i++)
                        arr[x - tm][i] = 1;
                    for (int i = Math.max(0, y - tm); i < Math.min(m, y + tm - 1) && x + tm - 2 < m; i++)
                        arr[x + tm - 2][i] = 1;
                    for (int i = Math.max(0, x - tm); i < Math.min(m, x + tm - 2) && y - tm >= 0; i++)
                        arr[i][y - tm] = 1;
                    for (int i = Math.max(0, x - tm); i < Math.min(m, x + tm - 2) && y + tm - 2 < m; i++)
                        arr[i][y + tm - 2] = 1;
                }
            }
            time++;
        }
        System.out.println(time - 2);
    }

    public static boolean solve(long[][] arr, long m) {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < m; j++)
                if (arr[i][j] == 0) return true;
        return false;
    }
}
