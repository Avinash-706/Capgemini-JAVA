import java.util.Scanner;

public class LeadersOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of The Array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        
        //  Input
        System.out.print("Enter Elements of the Array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // Logic
        System.out.print("Leaders : ");
        for(int i = 0 ; i < n ; i++){
            boolean check = true;
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    check = false;
                    break;
                }
            }

            if(check)   System.out.print(arr[i] + "  ");
        }
    }
}