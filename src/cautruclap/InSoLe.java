package cautruclap;

import java.util.Scanner;

public class InSoLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào dãy số: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i += 2){
            System.out.println(i + " ");
        }
    }
}
