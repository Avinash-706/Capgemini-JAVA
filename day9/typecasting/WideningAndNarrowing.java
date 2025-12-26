public class WideningAndNarrowing {
    public static void main(String[] args) {
        // implicit / widening type casting
        byte b = 10;
        int  a = b;
        System.out.println(a);

        // explicit / narrowing typecasting
        int x = 97;
        char y = (char)(x);
        System.out.println(y);
    }
}
