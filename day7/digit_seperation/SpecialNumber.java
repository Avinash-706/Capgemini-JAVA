import java.util.Scanner;

public class SpecialNumber {

    public static boolean checkSpecialNumber(int n){
        int temp = n;

        int sum = 0;
        int product = 1;

        while(temp != 0){
            int digit  = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
        
        return (sum + product) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println(n + (checkSpecialNumber(n) ? " is " : " is Not ") + "a Special Number");
    }
}
