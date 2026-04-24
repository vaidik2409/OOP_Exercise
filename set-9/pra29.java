import java.util.*;

public class pra29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("All Marks: " + marks);
        System.out.println("Highest Marks: " + Collections.max(marks));
        System.out.println("Lowest Marks: " + Collections.min(marks));
    }
}