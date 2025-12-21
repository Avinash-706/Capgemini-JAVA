import java.util.Scanner;

class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Divisible by 7
        System.out.print("Enter a number to check divisibility by 7: ");
        int a = sc.nextInt();

        if (a % 7 == 0)     System.out.println(a + " is Divisible by 7");
        else                System.out.println(a + " is NOT Divisible by 7");

        // Divisible by both 3 and 5
        System.out.print("\nEnter a number to check divisibility by both 3 and 5: ");
        int b = sc.nextInt();

        if (b % 3 == 0 && b % 5 == 0)   System.out.println(b + " is Divisible by BOTH 3 and 5");
        else                            System.out.println(b + " is NOT Divisible by BOTH 3 and 5");

        sc.close();
    }
}
