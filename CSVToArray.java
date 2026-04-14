import java.io.*;
import java.util.*;

public class CSVToArray{
    public static void main(String[] args) {
        String[] array = new String[666];
        String csvFile = "five_letter_words.csv";
        int index = 0;

  try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
        } catch (IOException e) {
            e.printStackTrace();
        }

  }
}
