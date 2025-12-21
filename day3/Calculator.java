import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Operation (symbol): ");
        String choice = sc.nextLine();
        int res = 0;    //result

        switch (choice) {
            case "+":   //addition
                System.out.print("Enter the Number of Variables to Perform " + choice + " Operation : ");
                int var1 = sc.nextInt();
                for(int i = 1 ; i <= var1; i++){
                    System.out.print("Enter Value " + i + " : ");
                    int value = sc.nextInt();
                    if(i == 1)  res  =  value;
                    else        res +=  value;
                }
                break;

            case "-":   //subtraction
                System.out.print("Enter the Number of Variables to Perform " + choice + " Operation : ");
                int var2 = sc.nextInt();
                for(int i = 1 ; i <= var2; i++){
                    System.out.print("Enter Value " + i + " : ");
                    int value = sc.nextInt();
                    if(i == 1)  res  =  value;
                    else        res -=  value;
                }
            
            case "*":   //multiply
                System.out.print("Enter the Number of Variables to Perform " + choice + " Operation : ");
                int var3 = sc.nextInt();
                for(int i = 1 ; i <= var3; i++){
                    System.out.print("Enter Value " + i + " : ");
                    int value = sc.nextInt();
                    if(i == 1)  res  =  value;
                    else        res *=  value;
                }
                break;

            case "/":   //division
                System.out.print("Enter The Value 1 : ");
                int val1 = sc.nextInt();
                System.out.print("Enter The Value 2 : ");
                int val2 = sc.nextInt();
                res = val1 / val2;
                break;
        
            default:    
                break;
        }
        System.out.println("The Result of " + choice + " Operation : " + res);
    }
}
