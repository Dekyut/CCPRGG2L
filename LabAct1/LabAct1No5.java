
package labact1no5;

//5. Write a java program that reads a text file (dummy.txt) and create a new file with the same contents but will all
//the words in reverse order. The program should prompt the user for the input and output file names. Hint: Use an array.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class LabAct1no5 {

   public static void main(String[] args) throws IOException {
        // Read the input file
        BufferedReader reader = new BufferedReader(new FileReader("dummy.txt"));
        String line;
        Deque<String> words = new ArrayDeque<>();
        while ((line = reader.readLine()) != null) {
            // Split the line into words and add them to the deque
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.addFirst(word);
            }
        }
        reader.close();

        // Write the reversed words to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        while (!words.isEmpty()) {
            String word = words.pollFirst();
            writer.write(word);
            writer.write(" ");
        }
        writer.close();
    }
}
