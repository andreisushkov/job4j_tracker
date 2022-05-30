package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Information of program: " + active + " " + status + " Message for you: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 10, "This program works correctly");
        error.printInfo();
        Error smallError = new Error(false, -2, "Small error in the program");
        smallError.printInfo();
        Error greatError = new Error(false, -100, "Great error in the program");
        greatError.printInfo();
        Error error1 = new Error();
        error1.printInfo();
    }
}
