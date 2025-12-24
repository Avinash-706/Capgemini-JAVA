import java.util.Scanner;

public class OddMultiplyEvenDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter a number :  ");
        int n = sc.nextInt();

        int even = 0, odd = 0;
        while(n != 0){
            int digit = n%10;
            if(digit % 2 == 0)  even += digit;
            else                odd += digit;
            n = n / 10;
        }

        System.out.println("Multiplication of Odd Digits with Even Digits : " + odd * even);
    }
    
}
