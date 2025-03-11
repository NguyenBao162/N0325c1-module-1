package cautrucdieukien;

import java.util.Scanner;

public class SoSanhSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Giá Trị A: ");
        int a = scanner.nextInt();
        System.out.print("Nhập Giá Trị B: ");
        int b = scanner.nextInt();

        int max, min;

        if (a > b) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        System.out.println("Số lớn nhất là : " + max);
        System.out.println("Số Nhỏ nhất là: " + min);


    }
}


