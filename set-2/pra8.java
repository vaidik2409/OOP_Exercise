import java.util.Scanner;

public class pra8 {

    static class Point {
        private int x;
        private int y;

        public Point() {
            x = 5;
            y = 5;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public void display() {
            System.out.println("Point coordinates: (" + x + ", " + y + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.print("Default constructor -> ");
        p1.display();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        Point p2 = new Point(x, y);
        System.out.print("Parameterized constructor -> ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Copy constructor -> ");
        p3.display();
    }
}
