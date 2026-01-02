import java.util.Scanner;

public class ParameterizedEmployee {
    int id;
    String name;
    double salary;

    public ParameterizedEmployee(){
        this.id = 0;
        this.name = "unknown";
        this.salary = 15000.0;
    }


    public ParameterizedEmployee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("\n--- Printing Details of Employee ---");
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double salary;

        System.out.print("Enter Id : ");
        id = sc.nextInt();

        System.out.print("Enter Name : ");
        name = sc.next();

        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();

        ParameterizedEmployee obj1 = new ParameterizedEmployee(id, name, salary);
        ParameterizedEmployee obj2 = new ParameterizedEmployee(2, "Avinash", 500000.0);
        ParameterizedEmployee obj3 = new ParameterizedEmployee(3, "Sahil", 200000.0);
        ParameterizedEmployee obj4 = new ParameterizedEmployee(4, "Kshitiz", 585312.0);

        obj1.printDetails();
        obj2.printDetails();
        obj3.printDetails();
        obj4.printDetails();
    }
}