// src/Main.java
public class Main {
    public static void main(String[] args) {
        // Get the logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use both instances to log messages
        logger1.log("First log message");
        logger2.log("Second log message");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Singleton works.");
        } else {
            System.out.println("Singleton failed.");
        }
    }
}
