import java.util.Scanner;

public class Abundant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i <= n/2 ; i++)    if(n % i == 0)  sum += i;

        System.out.println(n + " : " + (sum > n ? "Abundant Number" : "Not A Abundant Number"));
    }
}