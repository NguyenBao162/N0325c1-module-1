package ss5_cautruclap;

import java.util.Scanner;

public class InSoDA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập dãy n:" );
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2){
            if(i % 6 == 0){
                System.out.println(-i + " ");
            } else {
                System.out.println(i + "");
            }
        }
    }
}
