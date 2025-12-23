
public class PrintCharactersForLoop {
    
    public static void printLoop1(char n1, char n2) {
        System.out.println("\n\nPrint :\t" + n1 + " to " + n2);
        for(char i = n1; i <= n2 ; i++)     System.out.print(i + "\t");
    }

    public static void printLoop2(char n1, char n2) {
        System.out.println("\n\nPrint :\t" + n1 + " to " + n2);
        for(char i = n1; i >= n2 ; i--)     System.out.print(i + "\t");
    }

    public static void main(String[] args) {

        printLoop1( 'd',  'j');
        printLoop2( 'm',  'e');
        printLoop2( 'z',  't');
        printLoop1( 'r',  'x');
    }
}