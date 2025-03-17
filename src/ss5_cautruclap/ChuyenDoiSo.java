package ss5_cautruclap;

import java.util.Scanner;

public class ChuyenDoiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong");
        int n = scanner.nextInt();

        String binary = " ";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
        }

        System.out.println("Số nhị phân tương ứng là: " + binary);
    }
}
