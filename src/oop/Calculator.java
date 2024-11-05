package oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public void sumAllOperation(int y) {
        System.out.println(sum(y));
        System.out.println(minus(y));
        System.out.println(multiply(y));
        System.out.println(divide(y));
        System.out.println(sum(y) + minus(y) + multiply(y) + divide(y));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumAllOperation(10);
    }
}
