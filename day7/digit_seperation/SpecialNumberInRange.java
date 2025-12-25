import java.util.Scanner;

public class SpecialNumberInRange {

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

        for(int i = 1; i <= n ; i++){
            if(checkSpecialNumber(i))   System.out.println(i + " : a Special Number");
        }
        
        sc.close();
    }
}
