package ss4_cautrucdieukien;

import java.util.Scanner;

public class DichSoTiengAnh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời Bạn Nhập Số: ");
        int So = scanner.nextInt();

        switch (So) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("There");
                break;
            case 4:
                System.out.println("For");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eght");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Số Không Hợp Lệ");

        }

    }
}
