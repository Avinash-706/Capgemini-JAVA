import java.util.Scanner;

public class ClockProbelm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Hour : ");
        int input1 = sc.nextInt();
        System.out.print("Enter the multiplier : ");
        int input2 = sc.nextInt();

        int time = input1 * input2;
        time = time % 12;
        System.out.println(time == 0 ? 12 : time);
    }
}
