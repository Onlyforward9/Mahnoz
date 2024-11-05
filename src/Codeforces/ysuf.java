package Codeforces;

import java.lang.reflect.Array;
import java.util.*;

public class ysuf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int []arr=new int[n];
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        if (list.size()<k){
            System.out.println("NO");
        }
        else {
            Collections.sort(list);
            for (int i = list.size()-1; i >=list.size()-k ; i--) {
                System.out.println(list.get(i));
            }
        }
    }
}
