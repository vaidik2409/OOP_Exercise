import java.util.Scanner;

public class pra6 {

    static class Triangle {
        private double a, b, c, height, base;

        public Triangle() {
            a = b = c = base = height = 1;
        }

        public Triangle(double a, double b, double c, double base, double height) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.base = base;
            this.height = height;
        }

        public double getArea() {
            return 0.5 * base * height;
        }

        public double getPerimeter() {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        System.out.print("Enter base for area calculation: ");
        double base = sc.nextDouble();

        System.out.print("Enter height for area calculation: ");
        double height = sc.nextDouble();

        Triangle tri = new Triangle(a, b, c, base, height);

        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }
}
