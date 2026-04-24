import java.util.*;

public class pra32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rollNumbers = new LinkedList<>();

        System.out.print("Enter number of roll numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter roll numbers:");
        for (int i = 0; i < n; i++) {
            rollNumbers.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int r = sc.nextInt();

        System.out.println("Found: " + searchElement(rollNumbers, r));

        sc.nextLine();

        LinkedList<String> names = new LinkedList<>();

        System.out.print("Enter number of names: ");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");
        for (int i = 0; i < m; i++) {
            names.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        System.out.println("Found: " + searchElement(names, name));
    }
}