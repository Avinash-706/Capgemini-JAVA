
public class NumbersDivisibleBy7 {
    public static void main(String[] args) {

        System.out.println("Numbers Divisble by 7 between 100 to 50 : ");
        for(int i = 100; i >= 50; i--){
            if(i % 7 == 0)  System.out.print(i + "\t");
        }
    }    
}
