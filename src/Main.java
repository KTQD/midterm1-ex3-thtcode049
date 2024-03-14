import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng Tàu");
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(replacedContent);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
