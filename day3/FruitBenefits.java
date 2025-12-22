
public class FruitBenefits {
    public static void main(String[] args) {
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.print(fruit + " : " + "Apple are rich in fiber and vitamin C");
                break;
            case "banana":
                System.out.print(fruit + " : " + "Bananas are a great source of potassium");
                break;
            case "mango":
                System.out.print(fruit + " : " + "Mangoes are the king of fruits!!");
                break;
            case "orange":
                System.out.print(fruit + " : " + "Oranges are packed with vitamin C");
                break;
            default :
                System.err.print(fruit + " : " + "Sorry !! I don't have information about it");
                break;
        }
    }
}