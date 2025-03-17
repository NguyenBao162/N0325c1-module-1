package ss4_cautrucdieukien;

import java.util.Scanner;

public class PTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương Trình Vô Số Nghiệm");
            } else {
                System.out.println("Phương Trình Vô Nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của Phương Trình là x = " + x);
        }
    }
}
