package ss6_PhuongThuc;

import java.util.Scanner;

public class Bai8 {
    static String Name1, Name2, Name3, Name4, Name5;
    static int age1, age2, age3, age4, age5 ;
    static String gender1, gender2, gender3, gender4, gender5;
    static double salary1, salary2, salary3, salary4, salary5;
    static double gpa1, gpa2, gpa3, gpa4, gpa5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        enterInformation1();
        System.out.print("Bạn có muốn nhập tiếp nhân viên không? (Yes/No): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            enterInformation2();
            System.out.print("Bạn có muốn nhập tiếp nhân viên không? (Yes/No): ");
            answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                enterInformation3();
                System.out.print("Bạn có muốn nhập tiếp nhân viên không? (Yes/No): ");
                answer = scanner.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    enterInformation4();
                    System.out.print("Bạn có muốn nhập tiếp nhân viên không? (Yes/No): ");
                    answer = scanner.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        enterInformation5();
                        showInformation1();
                        showInformation2();
                        showInformation3();
                        showInformation4();
                        showInformation5();
                    } else {
                        showInformation1();
                        showInformation2();
                        showInformation3();
                        showInformation4();
                    }
                } else {
                    showInformation1();
                    showInformation2();
                    showInformation3();
                }
            } else {
                showInformation1();
                showInformation2();
            }
        } else {
            showInformation1();
        }
    }
    // Nhập thông tin
    public static void enterInformation1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên 1");

        System.out.print("Nhập họ và tên : ");
        Name1 = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender1 = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary1 = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa1 = scanner.nextDouble();
    }

    public static void enterInformation2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên 2");

        System.out.print("Nhập họ và tên : ");
        Name2 = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender2 = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary2 = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa2 = scanner.nextDouble();
    }
    public static void enterInformation3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên 3");

        System.out.print("Nhập họ và tên : ");
        Name3 = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender3 = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary3 = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa3 = scanner.nextDouble();
    }
    public static void enterInformation4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên 4");

        System.out.print("Nhập họ và tên : ");
        Name4 = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age4 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender4 = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary4 = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa4 = scanner.nextDouble();
    }
    public static void enterInformation5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên 5");

        System.out.print("Nhập họ và tên : ");
        Name5 = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age5 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender5 = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary5 = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa5 = scanner.nextDouble();
    }
    // Xuất thông tin
    public static void showInformation1() {
        System.out.println("\nThông tin nhân viên 1 :");
        System.out.println("Họ tên: " + Name1);
        System.out.println("Tuổi: " + age1);
        System.out.println("Giới tính: " + gender1);
        System.out.println("Mức lương: " + salary1);
        System.out.println("Điểm trung bình: " + gpa1);
    }
    public static void showInformation2() {
        System.out.println("\nThông tin nhân viên 2 :");
        System.out.println("Họ tên: " + Name2);
        System.out.println("Tuổi: " + age2);
        System.out.println("Giới tính: " + gender2);
        System.out.println("Mức lương: " + salary2);
        System.out.println("Điểm trung bình: " + gpa2);
    }
    public static void showInformation3() {
        System.out.println("\nThông tin nhân viên 3 :");
        System.out.println("Họ tên: " + Name3);
        System.out.println("Tuổi: " + age3);
        System.out.println("Giới tính: " + gender3);
        System.out.println("Mức lương: " + salary3);
        System.out.println("Điểm trung bình: " + gpa3);
    }
    public static void showInformation4() {
        System.out.println("\nThông tin nhân viên 4 :");
        System.out.println("Họ tên: " + Name4);
        System.out.println("Tuổi: " + age4);
        System.out.println("Giới tính: " + gender4);
        System.out.println("Mức lương: " + salary4);
        System.out.println("Điểm trung bình: " + gpa4);
    }
    public static void showInformation5() {
        System.out.println("\nThông tin nhân viên 5 :");
        System.out.println("Họ tên: " + Name5);
        System.out.println("Tuổi: " + age5);
        System.out.println("Giới tính: " + gender5);
        System.out.println("Mức lương: " + salary5);
        System.out.println("Điểm trung bình: " + gpa5);
    }


}

