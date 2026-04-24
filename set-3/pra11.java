import java.util.ArrayList;
import java.util.Scanner;

public class pra11 {

    static class College {
        private String collegeName;
        private ArrayList<Admission> admissions = new ArrayList<>();

        public College(String collegeName) {
            this.collegeName = collegeName;
        }

        class Admission {
            private String studentName;
            private String course;

            public void acceptStudentDetails(Scanner sc) {
                System.out.print("Enter student name: ");
                studentName = sc.nextLine();
                System.out.print("Enter course to enroll: ");
                course = sc.nextLine();
            }

            public void displayAdmissionDetails() {
                System.out.println("Student Name: " + studentName);
                System.out.println("Course Enrolled: " + course);
            }
        }

        public void addStudent(Scanner sc) {
            Admission student = new Admission();
            student.acceptStudentDetails(sc);
            admissions.add(student);
        }

        public void displayAllAdmissions() {
            System.out.println("\n--- College: " + collegeName + " ---");
            for (int i = 0; i < admissions.size(); i++) {
                System.out.println("\nStudent " + (i + 1) + " Details:");
                admissions.get(i).displayAdmissionDetails();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String collegeName = sc.nextLine();
        College college = new College(collegeName);

        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    college.addStudent(sc);
                    break;
                case 2:
                    college.displayAllAdmissions();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }
}
