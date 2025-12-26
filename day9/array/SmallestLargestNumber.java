import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Number of The Array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }


        // Smallest Element
        int smallest = arr[0];
        for(int i = 0 ; i < n ; i++){
            smallest = Math.min(smallest, arr[i]);
        }
        
        System.out.println("Smallest Element In The Array : " + smallest);


        // largest Element
        int largest = 0;
        for(int i = 0 ; i < n ; i++){
            largest = Math.max(largest, arr[i]);
        }
        
        System.out.println("Largest Element In The Array : " + largest);


        // Second Smallest
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int third_small = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            int x = arr[i];

            if(x < small){
                third_small = second_small;
                second_small = small;
                small = x;
            }
            else if(x < second_small && x != small){
                third_small = second_small;
                second_small = x;
            }
            else if(x < third_small && x != second_small && x != small){
                third_small = x;
            }
        }
        System.out.println("Second Smallest Element In The Array : " + second_small);
        System.out.println("Third  Smallest Element In The Array : " + third_small);


        // Third Largest Element
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int third_large = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            int x = arr[i];

            if(x > large){
                third_large = second_large;
                second_large = large;
                large = x;
            }
            else if(x > second_large && x != large){
                third_large = second_large;
                second_large = x;
            }
            else if(x > third_large && x != second_large && x != large){
                third_large = x;
            }
        }

        System.out.println("Second Largest Element In The Array : " + second_large);
        System.out.println("Third  Largest Element In The Array : " + third_large);
    }    
}
