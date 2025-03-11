package cautrucdieukien;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 số x: ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0){
            System.out.println(x + " Là số chính phương");
        } else {
            System.out.println(x + " Không phải số chính phương");
        }
    }
}
