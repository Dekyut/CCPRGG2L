
package labact1no5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class LabAct1no5 {

   public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dummy.txt"));
        String line;
        Deque<String> words = new ArrayDeque<>();
        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.addFirst(word);
            }
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        while (!words.isEmpty()) {
            String word = words.pollFirst();
            writer.write(word);
            writer.write(" ");
        }
        writer.close();
    }
}
