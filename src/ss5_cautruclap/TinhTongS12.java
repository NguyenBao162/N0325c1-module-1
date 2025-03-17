package ss5_cautruclap;

import java.util.Scanner;

public class TinhTongS12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        double s = 0.0;
        for (int i = 1; i <= n; i ++){
        s = s + 1.0/i;
            System.out.println("Tổng S = " + s );
        }





    }
}
