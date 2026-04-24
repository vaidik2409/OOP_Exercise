import java.io.*;

public class pra27 {
    public static void main(String[] args) {
        File file = new File("students.txt");

        try {
            FileWriter fw = new FileWriter(file);

            fw.write("1 Rahul 85\n");
            fw.write("2 Amit 90\n");
            fw.write("3 Priya 88\n");

            fw.close();

            System.out.println("Data written successfully\n");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("File operation completed");
        }
    }
}