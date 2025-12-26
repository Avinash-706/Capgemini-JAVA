public class Basics {
    public static void main(String[] args) {
        
        int[] arr = {10, 11, 12, 13, 14};
        System.out.println("Length  of the Array : "  + arr.length);
        System.out.println("0-index of the Array : "  + arr[0]);

        int[] arr2 = new int[5];
        for(int i = 0 ; i < 5 ; i++){   //if instead of 5 i do 6 then "Array Index Out of Bound Expection"
            System.out.print(arr2[i] + " ");
        }
    }    
}
