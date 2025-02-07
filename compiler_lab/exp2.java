import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exp2 {
    public static void main(String[] args) {
        BufferedReader reader;
        int vowelCount = 0;
        int consonantCount = 0;
        try{
            reader = new BufferedReader(new FileReader("file.txt"));
            String currentLine = reader.readLine();

            while(currentLine != null){
                String words[] = currentLine.split(" ");

                for(String word: words){
                    char characters[] = word.toCharArray();
                    for(char ch : characters){
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                            vowelCount++;
                        }
                        if(Character.isLetter(ch)){
                            consonantCount++;
                        }
                    }
                }
                currentLine = reader.readLine();
            }

            consonantCount -= vowelCount;

            System.out.println("Vowel Count: " + vowelCount);
            System.out.println("Consonant Count: " + consonantCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
