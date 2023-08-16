import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter series of numbers");
        long n = in.nextLong();
        System.out.println("Enter a num to count");
        long num = in.nextLong();
        long count = 0;
        while(n > 0){
            long rem = n % 10;
            if(rem == num){
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}
