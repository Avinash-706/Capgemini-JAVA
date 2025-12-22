//  Important
//  The rule states a year divisible by 100 isn't a leap year unless it's also divisible by 400 (like the year 2000)

public class LeapYear {
    public static void main(String[] args) {
        int a = 1900;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))     System.out.print(a + " : Leap Year");
        else    System.out.print(a + " : NOT a Leap Year");
    }
    
}

//  The rule states a year divisible by 100 isn't a leap year unless it's also divisible by 400 (like the year 2000)