import java.io.*;
import java.util.StringTokenizer;

public class exp4 {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Using StringTokenizer to separate words by common delimiters
                StringTokenizer tokenizer = new StringTokenizer(line, " ,.;!?()\"'");

                while (tokenizer.hasMoreTokens()) {
                    System.out.println(tokenizer.nextToken());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
