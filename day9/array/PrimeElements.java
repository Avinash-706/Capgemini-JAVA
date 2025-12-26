import java.util.Scanner;

public class PrimeElements {

    public static boolean primeCheck(int n) {
        if(n == 0 || n == 1)    return false;
        
        for(int i = 2 ; i <= n/2 ; i++){
            if(n%i == 0)    return false;
        }

        return true;
    }

    public static boolean perfectCheck(int n) {
        if(n <= 1)      return false;

        int res = 1;
        for(int i = 2 ; i < n ; i++)   if(n % i == 0)  res += i;

        return  res == n;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        // Input
        int[] arr = new int[n];
        System.out.print("Enter Number of The Array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // Prime Number
        System.out.println("\nPrime Number In The Array are : ");
        for(int i = 0 ; i < n ; i++){
            if(primeCheck(arr[i]))     System.out.print(arr[i] + "  ");
        }

        // Pefect Number
        System.out.println("\nPerfect Number In The Array are : ");
        for(int i = 0 ; i < n ; i++){
            if(perfectCheck(arr[i]))     System.out.print(arr[i] + "  ");
        }


        // Sum
        int sum = 0;
        for(int i = 0 ; i < n ; i++)    sum += arr[i];
        System.out.print("\nSum of All Elements of the Array : " + sum);


        // Product
        int product = 1;
        for(int i = 0 ; i < n ; i++)    sum *= arr[i];
        System.out.print("\nProduct of All Elements of the Array : " + product);        
    }    
}
