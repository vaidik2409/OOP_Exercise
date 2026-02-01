import java.util.Scanner;
public class pra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter length of side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter length of side c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("The area of the triangle is: %.2f\n", area);
        } else {
            System.out.println("Invalid side lengths! These sides cannot form a triangle...");
        }
    }
}

