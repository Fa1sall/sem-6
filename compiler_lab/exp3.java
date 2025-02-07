import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            File fileObj = new File("file.txt");

            // Create the file if it doesn't exist
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Initialize FileWriter in append mode
            FileWriter fw = new FileWriter(fileObj, true);

            String text;
            System.out.println("Enter the contents of the file: (type 'end' to stop)");

            while (true) {
                text = scanner.nextLine();
                if (text.equals("end")) {
                    break;
                } else {
                    fw.write(text + "\n"); // Add newline after each input
                }
            }
            System.out.println("Contents copied to file.");
            fw.close(); // Close the FileWriter after writing

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
