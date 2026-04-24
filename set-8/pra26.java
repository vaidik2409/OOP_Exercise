import java.io.*;

public class pra26 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Please provide file name");
                return;
            }

            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            int lines = 0, words = 0, chars = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                chars += line.length();

                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}