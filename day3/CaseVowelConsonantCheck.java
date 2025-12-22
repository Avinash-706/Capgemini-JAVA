import java.util.Scanner;

class CaseVowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')      
                    System.out.println(ch + " is UPPERCASE VOWEL");
            else    System.out.println(ch + " is UPPERCASE CONSONANT");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')      
                    System.out.println(ch + " is LOWERCASE VOWEL");
            else    System.out.println(ch + " is LOWERCASE CONSONANT");
        } 
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
