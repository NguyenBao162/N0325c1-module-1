package cautruclap;

import java.util.Scanner;

public class InSoDuongAm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2){
            if (i % 4 == 0 ){
                System.out.print(-i + "");
            } else {
                System.out.print(i + "");
            }
        }
    }
}
