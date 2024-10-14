public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, whether an exception occurs or not.");
        }
    }
}