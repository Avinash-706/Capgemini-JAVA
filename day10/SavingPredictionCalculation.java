import java.util.Scanner;

public class SavingPredictionCalculation {

    public static double predict(double income, double expenses){
        return income-expenses;
    }

	public static double predict(double income, double expenses, boolean festiveMonth){
        return income - (expenses*1.2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income, base_saving, expenses;
        boolean festiveMonth;

        System.out.print("Enter Income  : ");
        income = sc.nextDouble();
        System.out.print("Enter Expense : ");
        expenses = sc.nextDouble();
        System.out.print("Is a Festive Month : ");
        festiveMonth = sc.nextBoolean();

        if(festiveMonth)    base_saving = predict(income, expenses, festiveMonth);
        else                base_saving = predict(income, expenses);

        System.out.print("Festive Expense : " + (int)(income - base_saving) + "\nSavings : "+ (int)base_saving);
    }
}