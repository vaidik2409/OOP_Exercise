import java.util.Scanner;

public class pra9 {

    static class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            width = 1;
            height = 1;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public void display() {
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for first rectangle:");
        System.out.print("Width: ");
        double w1 = sc.nextDouble();
        System.out.print("Height: ");
        double h1 = sc.nextDouble();
        Rectangle rect1 = new Rectangle(w1, h1);

        System.out.println("\nEnter details for second rectangle:");
        System.out.print("Width: ");
        double w2 = sc.nextDouble();
        System.out.print("Height: ");
        double h2 = sc.nextDouble();
        Rectangle rect2 = new Rectangle(w2, h2);

        System.out.println("\nFirst Rectangle:");
        rect1.display();

        System.out.println("\nSecond Rectangle:");
        rect2.display();

        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("\nThe first rectangle has a larger area.");
        } else if (rect1.getArea() < rect2.getArea()) {
            System.out.println("\nThe second rectangle has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have the same area.");
        }
    }
}
