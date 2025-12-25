public class PalindromeNumberInRange {

    public static boolean palindromeCheck(int n){
        int temp = n;
        int rev = 0;

        while(temp != 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        
        return  (rev==n);
    }

    public static void main(String[] args) {

        System.out.println("Palindrome Numbers in range 100 to 200 : ");

        for(int i = 1 ; i <= 100 ; i++){
            if(palindromeCheck(i))  System.out.println(i + "  :  is a Palindrome Number") ;
        }
    }
}
