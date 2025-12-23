
public class PrintNumbersForLoop {

    public static void printLoop1(int n1, int n2) {
        System.out.println("\n\nPrint :\t" + n1 + " to " + n2);
        for(int i = n1; i <= n2 ; i++)     System.out.print(i + "\t");
    }

    public static void printLoop2(int n1, int n2) {
        System.out.println("\n\nPrint :\t" + n1 + " to " + n2);
        for(int i = n1; i >= n2 ; i--)     System.out.print(i + "\t");
    }

    public static void main(String[] args) {

        printLoop1( 1111,  1121);
        printLoop2( 1234,  1223);
        printLoop2(-1111, -1121);
        printLoop1(-1234, -1223);
    }
}