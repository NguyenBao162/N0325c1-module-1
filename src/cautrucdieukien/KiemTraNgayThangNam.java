package cautrucdieukien;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class KiemTraNgayThangNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào ngày: ");
        int days = scanner.nextInt();

        if (days < 1 || days > 31) {
            System.out.println("Ngày không hợp lệ");
            return;
        }
        System.out.print("Nhập vào tháng: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (days == 31) {
                System.out.println("Ngày không hợp lệ");
                return;
            }
        }
        System.out.print("Nhập vào năm: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (days > 29) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            } else {
                if (days > 28) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            }
        }

        System.out.println("Ngày hợp lệ");

        int nextDays = days;
        int nextMonth = month;
        int nextYear = year;

        nextDays++;

        if ((nextDays > 31)
                || ((month == 2) && (nextDays > (isLeapYear ? 29 : 28)))
                || (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (nextDays > 30))) {
            nextDays = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("ngày kế tiếp: %d/%d/%d", nextDays, nextMonth, nextYear);

        int previousday = days;
        int previousmonth = month;
        int previousyear = year;

        previousday--;
        if (previousday < 1) {
            previousmonth--;
            if (previousmonth < 1) {
                previousmonth = 12;
                previousyear--;
            }
            if (previousmonth == 4 || previousmonth == 6 || previousmonth == 9 || previousmonth == 11) {
                previousday = 30;

            } else if (previousmonth == 2) {
                if (isLeapYear) {
                    previousday = 29;
                } else {
                    previousday = 28;
                }

            } else {
                previousday = 31;
            }
        }
        System.out.println();
        System.out.printf("ngay truoc do: %d/%d/%d ", previousday, previousmonth, previousyear);
    }

}
