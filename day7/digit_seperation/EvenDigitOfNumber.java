import java.util.Scanner;

public class EvenDigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :\t");
        int digit = sc.nextInt();

        System.out.print("Even Digit of " + digit + " :\t");
        while(digit != 0){
            if(digit % 2 == 0)  System.out.print(digit % 10 + "  ");
            digit = digit / 10;
        }
    }
}