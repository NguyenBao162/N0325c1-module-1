package cautruclap;

import java.util.Scanner;

public class InDaySo2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy n: ");
        int n = scanner.nextInt();

        for (int i = 2; i < 2 * n; i += 2){
            System.out.println(i + "");
        }
    }
}
