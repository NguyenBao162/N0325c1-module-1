package ss5_cautruclap;

import java.util.Scanner;

public class InCacHinhDauSao1 { // hinh a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chieuDaiCanh = scanner.nextInt();

        System.out.println("Hình a");
        for (int i = 1; i <= chieuDaiCanh; i++) {

            for (int j = 1; i <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }

            System.out.println();
        }
        // hinh b
        System.out.println("Hinh b");
        for (int i = 1; i <= chieuDaiCanh; i++) {

            for (int j = 1; i <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == chieuDaiCanh - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
    }
}