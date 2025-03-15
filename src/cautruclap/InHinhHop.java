package cautruclap;

import java.util.Scanner;

public class InHinhHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai cac canh hinh vuong: ");
        int chieuDaiCanh = scanner.nextInt();

        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == 1 || j == chieuDaiCanh) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

}
