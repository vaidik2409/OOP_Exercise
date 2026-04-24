import java.io.*;

public class pra28 {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            int lines = 0, words = 0, chars = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                chars += line.replace(" ", "").length();

                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (excluding spaces): " + chars);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input/Output error");
        }
    }
}