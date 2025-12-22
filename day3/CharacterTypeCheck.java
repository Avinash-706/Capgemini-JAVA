import java.util.Scanner;

class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))      System.out.println(ch + " is an UPPERCASE character");
        else if (Character.isLowerCase(ch)) System.out.println(ch + " is a LOWERCASE character");
        else if (Character.isDigit(ch))     System.out.println(ch + " is a DIGIT");
        else                                System.out.println(ch + " is a SPECIAL character");

        sc.close();
    }
}
