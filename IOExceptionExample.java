import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            // Perform file operations here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}