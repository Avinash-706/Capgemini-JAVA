import java.util.*;

public class FareProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, age;
        String name, type, cls, status = null;
        double base_fare = 0, final_fare = 0, discount = 0;
        Boolean gov_emp;


        System.out.print("Enter Id : ");
        id = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Base Fare : ");
        base_fare = sc.nextDouble();
        System.out.println("Enter Travel Type : 1. Bus 2. Train 3. Flight");
        int type_choice = sc.nextInt();
        switch (type_choice) {
            case 1:
                type = "Bus";
                System.out.println("Enter Class Selection : 1. Sleeper 2. Seater ");
                int class_choice1 = sc.nextInt();
                if(class_choice1 == 1){
                    cls = "Sleeper";
                    final_fare = base_fare * 1.2;
                }
                else if(class_choice1 == 2){
                    cls = "Seater";
                    final_fare = base_fare * 1.0;
                }
                else{
                    System.out.println("Invalid Choice");
                    return;
                }
                break;
            case 2:
                type = "Train";
                System.out.println("Enter Class Selection : 1. General 2. Sleeper 3. AC");
                int class_choice2 = sc.nextInt();
                if(class_choice2 == 1){
                    cls = "General";
                    final_fare = base_fare * 1.0;
                }
                else if(class_choice2 == 2){
                    cls = "Sleeper";
                    final_fare = base_fare * 1.3;
                }
                else if(class_choice2 == 3){
                    cls = "AC";
                    final_fare = base_fare * 1.6;
                }
                else{
                    System.out.println("Invalid Choice");
                    return;
                }
                break;
            case 3:
                type = "Flight";
                System.out.println("Enter Class Selection : 1. Economy 2. Business");
                int class_choice3 = sc.nextInt();
                if(class_choice3 == 1){
                    cls = "Economy";
                    final_fare = base_fare * 2.5;
                }
                else if(class_choice3 == 2){
                    cls = "Business";
                    final_fare = base_fare * 3.5;
                }
                else{
                    System.out.println("Invalid Choice");
                    return;
                }
                break;

            default:
                return;
        }

        System.out.println("Are you a Government Employee (true/false) : ");
        gov_emp = sc.nextBoolean();

        //discount
        if(age >= 60)                   discount = 30;
        else if(gov_emp == true)        discount = 15;
        else if(age >= 5 && age <= 12)  discount = 50;

        final_fare -= (discount/100) * final_fare;


        //status
        if(final_fare >= 10000){
            if(type.equals("Flight" ))   status = "Confirmed";
            else    status = "Waiting List";
        } 
        else    status = "Confirmed";

        System.out.println("\n--- Fare Processing System ---");
        System.out.println("\tPassenger ID : " + id);
        System.out.println("\tPassenger Name : " + name);
        System.out.println("\tTravel Type : " + type);
        System.out.println("\t" + type + " Class : " + cls);

        //age logic
        if(age < 5){
            System.out.println("\tFree Ticket - No Booking Required");
            return;
        }
        else if(age > 80){
            System.out.println("\tMedical Clearance Required");
            return;
        }
        else{
            System.out.println("\tBase Fare :" + base_fare);
            System.out.println("\tFinal Fare :" + final_fare);
            System.out.println("\tDiscount Applied :" + discount);
        }

        System.out.println("\tBooking Status :" + status);


    }
    
}
