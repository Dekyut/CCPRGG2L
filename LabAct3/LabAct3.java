
package labact3;

import java.io.*;

public class LabAct3 {

 
    public static void main(String[] args) {
     int vowelCount = 0;


    try (BufferedReader reader = new BufferedReader(new FileReader("dummy.txt"))) {
      String line;
      int lineCount = 0;
      while ((line = reader.readLine()) != null && lineCount < 5) {
        for (char c : line.toCharArray()) {
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowelCount++;
          }
        }
        System.out.println(line);     
        lineCount++;
      }
    } catch (IOException e) {
        System.out.println("There's an error in the code");
    }

    // Print the total number of vowels
    System.out.println("Total number of vowels: " + vowelCount);
  }
}




