package cautrucdieukien;

import java.util.Scanner;

public class PTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhâp b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhâp c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương Trình Vô Số Nghiệm");
                } else {
                    System.out.println("Phương Trình Vô Nghiệm");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiệm của Phương Trình là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương Trình Vô Nghiệm. ");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);
            }

        }
    }
}