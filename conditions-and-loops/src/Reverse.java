import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long list=0;

        while (n > 0){
            long rem = n % 10;
           n/=10;

           list = list * 10 + rem;
        }

        System.out.println(list);
    }

}
