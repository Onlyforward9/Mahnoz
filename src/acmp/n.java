package acmp;

public class n {
    public static void main(String[] args) {
        for (int i =1; i <= 40; i++) {
            double a = Math.sqrt(2022 - (i * i));
            double b = Math.sqrt(1080 - (i * i));
            if (a - b == 5) {
                System.out.println(i);
            }
        }
    }
}
