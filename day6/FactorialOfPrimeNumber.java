public class FactorialOfPrimeNumber {

    public static int printFactorial(int n) {
        if (n <= 1)     return 1;
        int res = 1;

        for (int i = n; i > 1; i--)     res *= i;
        return res;
    }

    public static boolean primeCheck(int n) {
        boolean bool = true;
        if (n == 0 || n == 1)   bool = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of all Prime Numbers In Range : ");
        for (int i = 14; i >= 5; i--) {
            if(primeCheck(i))   System.out.println(i + " :\t" +printFactorial(i)); 
        }
    }
}
