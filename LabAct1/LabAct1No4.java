package labact1no4;

import java.io.*;
import java.util.Scanner;

public class LabAct1No4 {
    
    
  public static void main(String[] args) {
    // Prompt the user for the file name
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the file name: ");
    String fileName = scanner.nextLine();

    // Read the file
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      int wordCount = 0;
      while ((line = reader.readLine()) != null) {
        String[] words = line.split(" ");
        wordCount += words.length;
      }
      System.out.println("Total number of words: " + wordCount);
    } catch (IOException e) {
      System.out.println("There's an error in the code");
    }
  }
}
