package cautruclap;

import java.util.Scanner;

public class DemVaTinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Nhập hai số nguyên dương a và b từ bàn phím. System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b (b > a): ");
        int b = scanner.nextInt();

        int soLuongSoDoiXung = 0;
        int tongSoDoXung = 0;

        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soLuongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;
        for (int n = a; n <= b; n++) {
            String str = Integer.toString(n);
            boolean isPalindrome = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length()- 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                soLuongSoDoiXung++;
                tongSoDoXung += n;
            }
            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                soLuongSoNguyenTo++;
                tongSoNguyenTo += n;
            }
        }
        System.out.printf("Sổ đối xứng trong đoạn [%d, %d]: %d\n", a, b, soLuongSoDoiXung);
        System.out.printf("Tổng số đối xứng trong đoạn [%d, %d]: %d\n", a, b, tongSoDoXung);
        System.out.printf("Số chính phương trong đoạn [%d, %d]: %d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tổng số chính phương trong đoạn [%d, %d]: %d\n", a, b, tongSoChinhPhuong);
        System.out.printf("Số nguyên tố trong đoạn [%d, %d]: %d\n", a, b, soLuongSoNguyenTo);
        System.out.printf("Tổng số nguyên tố trong đoạn [%d, %d]: %d\n", a, b, tongSoNguyenTo);
    }
}