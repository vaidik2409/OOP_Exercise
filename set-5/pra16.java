import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Other Division";
        }
    }
}

public class pra16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        String division = r.getDivision(avg);

        System.out.println("Result: " + division);
    }
}