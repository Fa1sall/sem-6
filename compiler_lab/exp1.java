import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exp1 {
    public static void main(String[] args) {
        BufferedReader reader;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try{
            reader = new BufferedReader(new FileReader("file.txt"));

            String currentLine = reader.readLine();

            while(currentLine != null){
                lineCount++;

                String words[] = currentLine.split(" ");
                wordCount += words.length;

                for(String word: words){
                    charCount = charCount + word.length();
                }
                
                //reads next line
                currentLine = reader.readLine();
            }

            System.out.println("character count: " + charCount);
            System.out.println("word count: " + wordCount);
            System.out.println("line count: " + lineCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
