import java.io.*;
import java.util.*;

public class CSVToArray{
    public static void main(String[] args) {
        String[] array = new String[666];
        String csvFile = "five_letter_words.csv";
        int index = 0;

  try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
          String line;
          while (line = br.readLine() != null && index < 666){
              String[] values = line.split(",");
          }
        } catch (IOException e) {
            e.printStackTrace();
        }

  }
}
