public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("An ArithmeticException occurred: " + e.getMessage());
        }
    }
}