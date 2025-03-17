package ss5_cautruclap;

import java.util.Scanner;

public class InDaySoBienDiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập dãy n: ");
        int n = scanner.nextInt();

        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2){
            if(count == distance) {
                System.out.println(-i + " ");
                count = 0;
                distance++;
            }else {
                System.out.println(i + " ");
                count++;
            }
        }
    }
}
