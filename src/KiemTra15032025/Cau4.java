package KiemTra15032025;

import java.util.ArrayList;
import java.util.List;

public class  Cau4{

    public static List<Integer> findPrimeNumbers(int[] arr) {
        List<Integer> primeList = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }
        return primeList;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 5, 6, 23, 8, 47, 10, 3};
        List<Integer> primeNumbers = findPrimeNumbers(inputArray);
        System.out.println(primeNumbers);
    }
}
