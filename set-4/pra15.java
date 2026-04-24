import java.util.Scanner;

class Employee {
    String name;
    String department;

    void getDetails(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void getManagerDetails(String name, String department, int teamSize, String projectName) {
        this.name = name;
        this.department = department;
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class pra15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter Employee Department: ");
        String edept = sc.nextLine();

        e.getDetails(ename, edept);

        Manager m = new Manager();

        System.out.print("Enter Manager Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter Manager Department: ");
        String mdept = sc.nextLine();

        System.out.print("Enter Team Size: ");
        int size = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Name: ");
        String project = sc.nextLine();

        m.getManagerDetails(mname, mdept, size, project);

        System.out.println("\nEmployee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}