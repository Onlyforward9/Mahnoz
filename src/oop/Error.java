package oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    Error() {

    }

    public void print() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 3, "Hello");
        Error error2 = new Error();
        error1.print();
        error2.print();
    }
}
