package src.videoSums;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4567, 234, 34, 6 };
        System.out.println(evenDigit(arr));
        // System.out.println(digits(-45));
    }

    static int evenDigit(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (evenNumber(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean evenNumber(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
