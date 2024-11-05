package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class m41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        long n= Long.parseLong(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Long[]arr=new Long[(int) n];
        for (long i=0;i<n;i++)arr[(int) i]=Long.parseLong(st.nextToken());
        Arrays.parallelSort(arr);
        for (Long integer : arr) pw.print(integer + " ");
        pw.close();
    }
}
