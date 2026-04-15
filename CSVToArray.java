import java.io.*;
import java.util.*;

public class CSVToArray {
    public static void main(String[] args) {
        // Using an array is fine if you know the exact size,
        // but ArrayList is often safer for dynamic files.
        String[] array = new String[666];
        String csvFile = "five_letter_words.csv";
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null && index < 666) {
                // Split by comma
                String[] values = line.split(",");
                for (String value : values) {
                    if (index < 666) {
                        array[index++] = value.trim();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

}
}