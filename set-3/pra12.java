import java.util.Scanner;

public class pra12 {

    static class VolumeCalculator {

        public double calculateVolume(double side) {
            return side * side * side;
        }

        public double calculateVolume(double length, double width, double height) {
            return length * width * height;
        }

        public double calculateVolume(double radius, boolean isSphere) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator calculator = new VolumeCalculator();

        System.out.print("How many shapes do you want to calculate volumes for? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nShape " + i + ":");
            System.out.print("Enter shape type (cube/rectangle/sphere): ");
            String shape = sc.nextLine().toLowerCase();

            switch (shape) {
                case "cube":
                    System.out.print("Enter side of cube: ");
                    double side = sc.nextDouble();
                    System.out.println("Volume of Cube: " + calculator.calculateVolume(side));
                    break;

                case "rectangle":
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.println("Volume of Rectangular Cube: " + calculator.calculateVolume(length, width, height));
                    break;

                case "sphere":
                    System.out.print("Enter radius of sphere: ");
                    double radius = sc.nextDouble();
                    System.out.println("Volume of Sphere: " + calculator.calculateVolume(radius, true));
                    break;

                default:
                    System.out.println("Invalid shape type!");
                    i--; 
            }
            sc.nextLine(); 
        }
    }
}
