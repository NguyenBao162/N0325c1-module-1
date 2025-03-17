package ss4_cautrucdieukien;

import java.util.Scanner;

public class NgayThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập Năm: ");
        int year = scanner.nextInt();

        int daysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày", month, year, daysInMonth);
    }
}
