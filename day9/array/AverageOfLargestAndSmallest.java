import java.util.Scanner;

public class AverageOfLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of The Array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        //  Input 
        System.out.print("Enter Elements of the array :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int count_min = 0;
        int count_max = 0;

        for(int i : arr){
            if(mini == i)       ++count_min;
            else if(maxi == i)  ++count_max;
        }

        // Average
        float avg = (float)((count_max * maxi) + (count_min * mini)) / (count_max + count_min);

        System.out.println("Average of Smallest and Largest Numbers : " + avg);
    }
}
