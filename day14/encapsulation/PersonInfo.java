// Q1. Write a Java program to create a class called Person with private 
// instance variables name, age. and country. Provide public getter and 
// setter methods to access and modify these variables.
// --------------------------------------------------------------------

import java.util.Scanner;

class Main {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


public class PersonInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.next();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Country : ");
        String country = sc.next();

        // ✅ Correct object
        Main ref = new Main();
        ref.setName(name);
        ref.setAge(age);
        ref.setCountry(country);

        System.out.println("Name : " + ref.getName());
        System.out.println("Age : " + ref.getAge());
        System.out.println("Country : " + ref.getCountry());
    }
}