import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while(temp != 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }

        System.out.println((rev == n) ? "  :  is a Palindrome Number" : "  :  Not a Palindrome Number") ;
    }
    
}
