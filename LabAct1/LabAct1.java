package labact1;

import java.io.*;

public class LabAct1 {
  public static void main(String[] args) {
    // Read input file and add all the data
    int sum = 0;
    try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        sum += Integer.parseInt(line);
      }
    } catch (IOException e) {
      System.out.println("There is an error");
    }

    // Write sum to new file
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("sum.txt"))) {
      bw.write(String.valueOf(sum));
    } catch (IOException e) {
      System.out.println("There is an error");
    }
  }
}
