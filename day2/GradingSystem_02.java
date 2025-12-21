import java.util.*;
import java.lang.Character;

public class GradingSystem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char grade;
        System.out.print("Enter Grade : ");
        grade = sc.next().charAt(0);

        // Using Switch-Case
        switch (Character.toUpperCase(grade)) {
            case 'A':
                System.out.println(grade + " : Excellent");
                break;
            case 'B':
                System.out.println(grade + " : Good");
                break;
            case 'C':
                System.out.println(grade + " : Fair");
                break;
            case 'D':
                System.out.println(grade + " : Pass");
                break;
            case 'F':
                System.out.println(grade + " : FAIL !!");
                break;
            default:
                System.out.println("Invalid Input !!");
        }
    }
}
