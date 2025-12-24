import java.util.*;

public class LargestDigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :  ");
        int digit = sc.nextInt();

        int large = 0;
        int temp = digit;

        while (temp != 0) {
            large = Math.max(large, temp % 10);
            temp = temp / 10;
        }

        System.out.print("Large Digits of " + digit + " :  " + large);
    }
}