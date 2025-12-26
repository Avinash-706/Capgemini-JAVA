package recursion;
public class PrintNumber1to1000{

    public static void printNumber(int num) {
        if(num == 1001)     return  ;

        System.out.println(num);
        printNumber(num + 1);
    }

    public static void main(String[] args){
        printNumber(1);
    }
}