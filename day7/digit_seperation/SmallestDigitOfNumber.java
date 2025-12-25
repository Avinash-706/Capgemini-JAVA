import java.util.*;
public class SmallestDigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :  ");
        int digit = sc.nextInt();

        int small = 10;
        int temp = digit;
        
        while (temp != 0) {
            small = Math.min(small, temp % 10);
            temp = temp / 10;
        }

        System.out.print("Smallest Digits of " + digit + " :  " + small);
    }
}