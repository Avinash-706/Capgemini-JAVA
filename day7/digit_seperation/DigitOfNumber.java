package digit_seperation;
import java.util.Scanner;

public class DigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.print("Digits of " + n + " : ");
        while(n != 0){
            System.out.print(n % 10 + "  ");
            n = n / 10;
        }
    }
}