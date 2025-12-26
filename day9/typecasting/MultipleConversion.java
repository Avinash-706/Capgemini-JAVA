public class MultipleConversion {
    public static void main(String[] args) {
        long l = 987654321;
        System.out.println("Long : " + l);

        int i = (int)l;
        System.out.println("Type-Casted Long to Int : " + i);

        short s = (short)i;
        System.out.println("Type-Casted Int to Short : " + s);

        byte b = (byte)s;
        System.out.println("Type-Casted Short to Byte : " + b);
    }
}
