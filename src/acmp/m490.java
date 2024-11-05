package acmp;


import java.util.*;
import java.text.*;

public class m490 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date a = simpleDateFormat.parse(sc.nextLine()), b = simpleDateFormat.parse(sc.nextLine());
        System.out.println(Math.abs(a.getTime() - b.getTime()) / (24 * 60 * 60 * 1000));
    }
}
