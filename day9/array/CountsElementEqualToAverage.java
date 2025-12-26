import java.util.Scanner;

public class CountsElementEqualToAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of The Array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        
        int sum = 0;
        System.out.print("Enter Elements of the array :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int avg = sum/n;
        int count = 0;

        for(int i = 0 ; i < n; i++){
            if(arr[i] == avg)   count++;
        }

        System.out.println("Count of Elements which are equal to Average of all elements :\t" + count);
    }   
}
