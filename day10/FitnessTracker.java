import java.util.Scanner;

public class FitnessTracker {

    static int steps = 0;
    static double calories = 0;
    static double weight = 0;

    // Input Steps
    public static void inputSteps() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Today's Step Count : ");
        steps = sc.nextInt();
    }

    // Calories
    public static double calculateCalories(int steps) {
        return steps * 0.04;
    }

    // Personalized Calories with Weight
    public static double calculateCalories(int steps, double weight) {
        return steps * weight * 0.0005; // Calories = steps × weight × 0.0005
    }

    // Show Summary
    public static void showSummary() {
        System.out.println("\n---------- DAILY FITNESS SUMMARY -----------");
        System.out.println("Total Steps Taken Today : " + steps);
        System.out.println("Calories Burned         : " + Math.round(calories));
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputSteps();

        System.out.print("Do You Want Personalized Calories (Based on Weight)? (true/false) : ");
        boolean checkWeight = sc.nextBoolean();

        if (!checkWeight) {
            calories = calculateCalories(steps);
            showSummary();
            return;
        }

        System.out.print("Enter Your Weight (kg) : ");
        weight = sc.nextDouble();

        calories = calculateCalories(steps, weight);
        showSummary();

        sc.close();
    }
}