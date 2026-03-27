import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // Use try-with-resources to ensure the file is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                // 1. Increment line count
                lineCount++;
                
                // 2. Increment character count (excluding newline characters)
                charCount += line.length();
                
                // 3. Increment word count
                // trim() removes leading/trailing spaces
                // split("\\s+") splits by one or more whitespace characters
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            
            // Output the results in the required format
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
