public class RethrowExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            doSomething();
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }

    static void doSomething() throws Exception {
        // Some code that may throw an exception
        throw new Exception("An exception occurred in doSomething.");
    }
}