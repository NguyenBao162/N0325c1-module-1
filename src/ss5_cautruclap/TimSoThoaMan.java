package ss5_cautruclap;

public class TimSoThoaMan {
    public static void main(String[] args) {
        System.out.println("Các số thoa man dieu kien La:");
        for (int number = 10; number <= 99; number++) {

            int tensDigit = number / 10;
            int onesDigit = number % 10;

            int sum = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;
            if (product == 2 * sum) {
                System.out.println(number);
            }
        }
    }
}
