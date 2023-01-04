package labact1no1;

import java.io.*;
public class LabAct1No2 {

    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("dummy.txt"))) {
      String line;
      int lineCount = 0;
      while ((line = reader.readLine()) != null && lineCount < 5) {
        System.out.println(line);
        lineCount++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
