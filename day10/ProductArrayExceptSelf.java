import java.util.*;

public class ProductArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];
        
        // prefix product
        prefix[0] = 1;
        for(int i = 1; i < n; i++)      prefix[i] = prefix[i - 1] * nums[i - 1];   
        // suffix product
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) suffix[i] = suffix[i + 1] * nums[i + 1];
        
        
        // answer for each index
        for(int i = 0; i < n; i++)      ans[i] = prefix[i] * suffix[i];
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++)  nums[i] = sc.nextInt();
        
        int[] result = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(result));
        
        sc.close();
    }
}