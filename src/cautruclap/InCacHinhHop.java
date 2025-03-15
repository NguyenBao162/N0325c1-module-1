package cautruclap;

import java.util.Scanner;

public class InCacHinhHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai canh hinh vuong ");
        int chieuDaiCanh = scanner.nextInt();

        //hinh a
        for (int i = 1; i <= chieuDaiCanh; i ++){
            for (int j = 1; j <= chieuDaiCanh; i ++){
                if (i == 1 || i == chieuDaiCanh || j == 1){
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }

            System.out.println();
        }

        //hinh b
        System.out.println("hinh b");
        for (int i = 1; i <= chieuDaiCanh; i++){
            for (int j = 1; j <= chieuDaiCanh; j++){
                if (i==1 || i == chieuDaiCanh || j == chieuDaiCanh ){
                    System.out.println("* ");
                }   else {
                    System.out.println(" ");
                }
            }

            System.out.println();
        }
        // hinh c
        System.out.println("hinh c");
        for (int i = 1; i <= chieuDaiCanh; i++){
            for (int j = 1; j <= chieuDaiCanh; j++){
                if (i == chieuDaiCanh || j == 1 || j == chieuDaiCanh){
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }

            System.out.println();
        }
    }
}
