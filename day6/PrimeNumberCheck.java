import java.util.Scanner;

public class PrimeNumberCheck {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        boolean bool = true;
        if(n == 0 || n == 1)  bool = false;

        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                bool = false;
                break;
            }
        }

        System.out.println(n + " : " + (bool ? "Prime" : "Not A Prime"));
    }
    
}
